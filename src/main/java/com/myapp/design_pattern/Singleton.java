package com.myapp.design_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        log.info("initiate instance with data: {}", data);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    log.info("instance is null, creating a new object");
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
