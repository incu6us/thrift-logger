package com.github.incu6us.thrift.logger;

import com.github.incu6us.thrifttestnested.Args;
import com.github.incu6us.thrifttestnested.Result;
import com.github.incu6us.thrifttestnested.UglyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class InterceptorProcessorTest {

    private TServer server;
    private static final String host = "localhost";
    private static final int port = 8081;

    @BeforeEach
    public void setUp() throws TTransportException {
        startServer();
    }

    @AfterEach
    public void shutdown() {
        stopServer();
    }

    @Test
    void process() throws TException {

        final TTransport transport = new TSocket("localhost", port);
        transport.open();

        final TProtocol protocol = new TBinaryProtocol(transport);

//        final UglyService.Client client = new UglyService.Client(new LogProtocol(protocol, new ClientLogInterceptor()));
        final UglyService.Client client = new UglyService.Client(protocol);
        final Args args = new Args();
        args.name = "some name";

        final Result result = client.doSomething(args);
        log.info("Result: {}", result);
    }


    private void startServer() throws TTransportException {
        final TProcessor processor = new UglyService.Processor<>(new UglyServiceImpl());
        final TServerTransport transport = new TServerSocket(port);
        server = new TSimpleServer(new TServer.Args(transport).processor(new InterceptorProcessor(processor, new ServerInterceptor())));

        new Thread(() -> server.serve()).start();
    }

    private void stopServer() {
        if (Objects.nonNull(server)) {
            server.stop();
        }
    }

}
