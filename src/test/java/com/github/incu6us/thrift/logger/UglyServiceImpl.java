package com.github.incu6us.thrift.logger;

import com.github.incu6us.thrifttestnested.Args;
import com.github.incu6us.thrifttestnested.NestedResult;
import com.github.incu6us.thrifttestnested.Result;
import com.github.incu6us.thrifttestnested.UglyService;
import org.apache.thrift.TException;

public class UglyServiceImpl implements UglyService.Iface {
    @Override
    public Result doSomething(final Args tArgs) throws TException {
        final NestedResult nestedResult = new NestedResult();
        nestedResult.netedData = "Nested Data";

        final Result result = new Result();
        result.setIsSuccess(true);
        result.setData("Success");
        result.setNested(nestedResult);

        return result;
    }
}
