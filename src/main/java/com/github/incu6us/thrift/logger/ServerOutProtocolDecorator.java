package com.github.incu6us.thrift.logger;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.*;

import java.nio.ByteBuffer;

public class ServerOutProtocolDecorator extends TProtocolDecorator {

    private final Logger logger;

    private StringBuilder builder = new StringBuilder();

    /**
     * Encloses the specified protocol.
     *
     * @param protocol All operations will be forward to this protocol.  Must be non-null.
     */
    public ServerOutProtocolDecorator(final TProtocol protocol, final Logger logger) {
        super(protocol);

        this.logger = logger;
    }

    @Override
    public void writeMessageBegin(final TMessage tMessage) throws TException {
        builder = builder.append("{").append(tMessage.name).append(": ");
        super.writeMessageBegin(tMessage);
    }

    @Override
    public void writeMessageEnd() throws TException {
        logger.serverResponse(builder.append("}").toString());
        super.writeMessageEnd();
    }

    @Override
    public void writeStructBegin(final TStruct tStruct) throws TException {
        builder = builder.append("{").append(tStruct.name).append(": ");
        super.writeStructBegin(tStruct);
    }

    @Override
    public void writeStructEnd() throws TException {
        builder = builder.append("}");
        super.writeStructEnd();
    }

    @Override
    public void writeFieldBegin(final TField tField) throws TException {
        if (tField.type != TType.STOP) {
            builder = builder.append("{").append(tField.name).append(": ");
        }
        super.writeFieldBegin(tField);
    }

    @Override
    public void writeFieldEnd() throws TException {
        builder = builder.append("}");
        super.writeFieldEnd();
    }

    @Override
    public void writeFieldStop() throws TException {
        super.writeFieldStop();
    }

    @Override
    public void writeMapBegin(final TMap tMap) throws TException {
        builder = builder.append(tMap.valueType);
        super.writeMapBegin(tMap);
    }

    @Override
    public void writeMapEnd() throws TException {
        super.writeMapEnd();
    }

    @Override
    public void writeListBegin(final TList tList) throws TException {
        builder = builder.append(tList.elemType);
        super.writeListBegin(tList);
    }

    @Override
    public void writeListEnd() throws TException {
        super.writeListEnd();
    }

    @Override
    public void writeSetBegin(final TSet tSet) throws TException {
        builder = builder.append(tSet.elemType);
        super.writeSetBegin(tSet);
    }

    @Override
    public void writeSetEnd() throws TException {
        super.writeSetEnd();
    }

    @Override
    public void writeBool(final boolean b) throws TException {
        builder = builder.append(b);
        super.writeBool(b);
    }

    @Override
    public void writeByte(final byte b) throws TException {
        builder = builder.append(b);
        super.writeByte(b);
    }

    @Override
    public void writeI16(final short i) throws TException {
        builder = builder.append(i);
        super.writeI16(i);
    }

    @Override
    public void writeI32(final int i) throws TException {
        builder = builder.append(i);
        super.writeI32(i);
    }

    @Override
    public void writeI64(final long l) throws TException {
        builder = builder.append(l);
        super.writeI64(l);
    }

    @Override
    public void writeDouble(final double v) throws TException {
        builder = builder.append(v);
        super.writeDouble(v);
    }

    @Override
    public void writeString(final String s) throws TException {
        builder = builder.append(s);
        super.writeString(s);
    }

    @Override
    public void writeBinary(final ByteBuffer buf) throws TException {
        builder = builder.append(buf);
        super.writeBinary(buf);
    }

    @Override
    public TMessage readMessageBegin() throws TException {
        return super.readMessageBegin();
    }
}
