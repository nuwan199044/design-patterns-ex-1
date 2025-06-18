package com.myapp.design_pattern;

public interface ATCMediator {
    void registerFlight(Flight flight);
    void setLandingStatus(boolean status);
    boolean isLandingAllowed();
}
