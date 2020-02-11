package com.github.incu6us.thrift.logger;

import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;

public class InterceptorProcessor implements TProcessor {

    private final TProcessor processor;
    private final Interceptor interceptor;


    public InterceptorProcessor(final TProcessor processor, final Interceptor interceptor) {
        this.processor = processor;
        this.interceptor = interceptor;
    }

    @Override
    public void process(final TProtocol in, final TProtocol out) throws TException {
        Object injectedValue = interceptor.inject();

        final TMessage message = in.readMessageBegin();
        final ServerInProtocolDecorator serverInProtocolDecorator = new ServerInProtocolDecorator(in, message, interceptor);

        try {
            processor.process(serverInProtocolDecorator, new ServerOutProtocolDecorator(out, interceptor));
        } catch (final Exception e) {
            interceptor.serverResponse(e);

            throw e;
        } finally {
            interceptor.getInjectionResult(injectedValue);
        }
    }
}
