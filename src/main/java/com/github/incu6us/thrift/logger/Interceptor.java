package com.github.incu6us.thrift.logger;

public interface Interceptor<I, T> {
    I inject();
    void getInjectionResult(I value);
    void serverResponse(T field);
    void clientRequest(T field);
}
