package com.myapp.design_pattern;

public class FlightImpl implements Flight {
    private String flightId;
    private ATCMediator mediator;

    public FlightImpl(String flightId, ATCMediator mediator) {
        this.flightId = flightId;
        this.mediator = mediator;
        mediator.registerFlight(this);
    }
    @Override
    public void requestLanding() {
        System.out.println(flightId + " requesting permission to land...");
        if (mediator.isLandingAllowed()) {
            System.out.println("Landing permission granted to " + flightId);
            land();
        } else {
            System.out.println("Landing permission denied to " + flightId);
        }
    }

    @Override
    public void land() {
        System.out.println(flightId + " landed successfully.");
        mediator.setLandingStatus(false); // mark the runway as occupied
    }
}
