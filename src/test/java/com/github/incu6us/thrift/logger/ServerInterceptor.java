package com.github.incu6us.thrift.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerInterceptor<T> implements Interceptor<Long, T> {


    @Override
    public Long inject() {
        return System.currentTimeMillis();
    }

    @Override
    public void getInjectionResult(Long value) {
        log.info("ts: {}ms.", System.currentTimeMillis() - value);
    }

    @Override
    public void serverResponse(final T field) {
        log.info("Server Field: {}", field);
    }

    @Override
    public void clientRequest(T field) {
        log.info("Client Field: {}", field);
    }
}
