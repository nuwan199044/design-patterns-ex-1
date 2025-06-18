package com.myapp.design_pattern;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
    private boolean landingStatus;
    private List<Flight> flights = new ArrayList<>();
    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.landingStatus = status;
    }

    @Override
    public boolean isLandingAllowed() {
        return landingStatus;
    }
}
