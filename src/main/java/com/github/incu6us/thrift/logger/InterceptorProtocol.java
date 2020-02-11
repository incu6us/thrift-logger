package com.github.incu6us.thrift.logger;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolDecorator;
import org.apache.thrift.transport.TTransportException;

import java.nio.ByteBuffer;

public class InterceptorProtocol extends TProtocolDecorator {

    private final Interceptor interceptor;

    /**
     * Encloses the specified protocol.
     *
     * @param protocol All operations will be forward to this protocol.  Must be non-null.
     */
    public InterceptorProtocol(final TProtocol protocol, final Interceptor interceptor) {
        super(protocol);

        this.interceptor = interceptor;
    }

    @Override
    public TMessage readMessageBegin() throws TException {
        try {
            final TMessage message = super.readMessageBegin();
            interceptor.serverResponse(message);

            return message;
        } catch (final TTransportException e) {
            interceptor.serverResponse(e);

            throw e;
        }
    }

    @Override
    public ByteBuffer readBinary() throws TException {
        final ByteBuffer byteBuffer = super.readBinary();

        return byteBuffer;
    }
}
