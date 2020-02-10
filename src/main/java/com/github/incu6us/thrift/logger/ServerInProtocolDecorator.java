package com.github.incu6us.thrift.logger;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.*;

import java.nio.ByteBuffer;


class ServerInProtocolDecorator extends TProtocolDecorator {

    private final TProtocol protocol;
    private final TMessage message;
    private final Logger logger;

    private StringBuilder builder = new StringBuilder();

    /**
     * Encloses the specified protocol.
     *
     * @param protocol All operations will be forward to this protocol.  Must be non-null.
     */
    public ServerInProtocolDecorator(final TProtocol protocol, final TMessage message, final Logger logger) {
        super(protocol);

        this.protocol = protocol;
        this.message = message;
        this.logger = logger;
    }


    @Override
    public TMessage readMessageBegin() throws TException {
        builder = builder.append("{").append(message.name).append(": ");
        return message;
    }

    @Override
    public void readMessageEnd() throws TException {
        logger.clientRequest(builder.append("}"));
        super.readMessageEnd();
    }

    @Override
    public TField readFieldBegin() throws TException {
        final TField tField = super.readFieldBegin();
        if (tField.type != TType.STOP) {
            builder = builder.append(tField.id).append(": ");
        }
        return tField;
    }

    @Override
    public void readFieldEnd() throws TException {
        super.readFieldEnd();
    }

    @Override
    public String readString() throws TException {
        String s = super.readString();
        builder = builder.append(s);
        return s;
    }

    @Override
    public byte readByte() throws TException {
        byte b = super.readByte();
        builder = builder.append(b);
        return b;
    }
}
