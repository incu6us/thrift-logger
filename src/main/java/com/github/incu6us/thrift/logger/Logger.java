package com.github.incu6us.thrift.logger;

public interface Logger<T> {
    void serverResponse(T field);

    void clientRequest(T field);
}
