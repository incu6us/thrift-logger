package com.github.incu6us.thrift.logger;

import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;

public class LogProcessor<I> implements TProcessor {

    private final TProcessor processor;
    private final Logger logger;


    public LogProcessor(final TProcessor processor, final Logger logger) {
        this.processor = processor;
        this.logger = logger;
    }

    @Override
    public void process(final TProtocol in, final TProtocol out) throws TException {
        final TMessage message = in.readMessageBegin();
        final ServerInProtocolDecorator serverInProtocolDecorator = new ServerInProtocolDecorator(in, message, logger);

        try {
            processor.process(serverInProtocolDecorator, new ServerOutProtocolDecorator(out, logger));
        } catch (final Exception e) {
            logger.serverResponse(e);

            throw e;
        }
    }
}
