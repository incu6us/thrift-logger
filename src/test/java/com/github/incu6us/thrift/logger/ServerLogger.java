package com.github.incu6us.thrift.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerLogger<I> implements Logger<I>{
    @Override
    public void serverResponse(final I field) {
        log.info("Server Field: {}", field);
    }

    @Override
    public void clientRequest(I field) {
        log.info("Client Field: {}", field);
    }
}
