log-processor
---

### Output 
```
30 [Thread-0] INFO com.github.incu6us.thrift.logger.ServerInterceptor - Client Field: {doSomething: 1: 2: some name}
34 [Thread-0] INFO com.github.incu6us.thrift.logger.ServerInterceptor - Server Field: {doSomething: {doSomething_result: {success: {Result: {isSuccess: true}{data: Success}{nested: {NestedResult: {netedData: Nested Data}}}}}}}
34 [Thread-0] INFO com.github.incu6us.thrift.logger.ServerInterceptor - ts: 12ms.
34 [main] INFO com.github.incu6us.thrift.logger.InterceptorProcessorTest - Result: Result(isSuccess:true, data:Success, nested:NestedResult(netedData:Nested Data))
```
