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
        logger.clientRequest(builder.append("}").toString());
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

    @Override
    public TMap readMapBegin() throws TException {
        TMap tMap = super.readMapBegin();
        builder = builder.append(tMap.keyType).append(":").append(tMap.valueType);
        return tMap;
    }

    @Override
    public TList readListBegin() throws TException {
        TList tList = super.readListBegin();
        builder = builder.append(tList.elemType);
        return tList;
    }

    @Override
    public TSet readSetBegin() throws TException {
        TSet tSet = super.readSetBegin();
        builder = builder.append(tSet.elemType);
        return tSet;
    }

    @Override
    public boolean readBool() throws TException {
        boolean b = super.readBool();
        builder = builder.append(b);
        return b;
    }

    @Override
    public short readI16() throws TException {
        short i = super.readI16();
        builder = builder.append(i);
        return i;
    }

    @Override
    public int readI32() throws TException {
        int i = super.readI32();
        builder = builder.append(i);
        return i;
    }

    @Override
    public long readI64() throws TException {
        long l = super.readI64();
        builder = builder.append(l);
        return l;
    }

    @Override
    public double readDouble() throws TException {
        double d = super.readDouble();
        builder = builder.append(d);
        return d;
    }

    @Override
    public ByteBuffer readBinary() throws TException {
        ByteBuffer b = super.readBinary();
        builder = builder.append(b);
        return b;
    }
}
