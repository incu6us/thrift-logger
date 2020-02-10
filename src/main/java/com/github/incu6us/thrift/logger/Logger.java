package com.github.incu6us.thrift.logger;

public interface Logger<I> {
    void serverResponse(I field);
    void clientRequest(I field);
}
