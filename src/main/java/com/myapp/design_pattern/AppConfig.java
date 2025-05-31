package com.myapp.design_pattern;

public enum AppConfig {
    INSTANCE("Production");

    private String configName;

    AppConfig(String configName) {
        this.configName = configName;
    }

    public String getConfigName() {
        return configName;
    }

    public void printConfig() {
        System.out.println("Current config: " + configName);
    }
}
