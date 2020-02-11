log-processor
---

<a href="https://github.com/incu6us/thrift-logger"><img alt="ci status" src="https://github.com/incu6us/thrift-logger/workflows/Java%20CI/badge.svg"></a>


Logger for Thrift Server

# Usage:
```java
            ...
            final TProcessor processor = new UglyService.Processor<>(new UglyServiceImpl());
            final TServerTransport transport = new TServerSocket(port);
            server = new TSimpleServer(new TServer.Args(transport).processor(new LogProcessor(processor, new ServerTestLogger())));

            new Thread(() -> server.serve()).start();
        }
    
        @Slf4j
        public class ServerTestLogger<T> implements Logger<T> {
        
            @Override
            public void serverResponse(final T field) {
                log.info("Server Field: {}", field);
            }
        
            @Override
            public void clientRequest(final T field) {
                log.info("Client Field: {}", field);
            }
        }
```

### Output 
```
30 [Thread-0] INFO com.github.incu6us.thrift.logger.LoggerProcessorTest$ServerTestLogger - Client Field: {doSomething: 1: 2: some name}
37 [Thread-0] INFO com.github.incu6us.thrift.logger.LoggerProcessorTest$ServerTestLogger - Server Field: {doSomething: {doSomething_result: {success: {Result: {isSuccess: true}{data: Success}{nested: {NestedResult: {netedData: Nested Data}}}}}}}
38 [main] INFO com.github.incu6us.thrift.logger.LoggerProcessorTest - Result: Result(isSuccess:true, data:Success, nested:NestedResult(netedData:Nested Data))
```
