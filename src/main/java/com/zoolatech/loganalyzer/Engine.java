package com.zoolatech.loganalyzer;

public class Engine {
    private static final Engine ENGINE = new Engine();

    private Engine() {

    }

    public static Engine getInstance() {
        return ENGINE;
    }
}
