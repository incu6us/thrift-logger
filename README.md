log-processor
---

### Output 
```
31 [Thread-0] INFO com.github.incu6us.thrift.logger.ServerLogger - Client Field: {doSomething: 1: 2: some name}
34 [Thread-0] INFO com.github.incu6us.thrift.logger.ServerLogger - Server Field: {doSomething: {doSomething_result: {success: {Result: {isSuccess: true}{data: Success}{nested: {NestedResult: {netedData: Nested Data}}}}}}}
34 [main] INFO com.github.incu6us.thrift.logger.LogProcessorTest - Result: Result(isSuccess:true, data:Success, nested:NestedResult(netedData:Nested Data))
```
