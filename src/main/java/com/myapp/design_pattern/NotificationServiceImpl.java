package com.myapp.design_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationServiceImpl implements NotificationService {
    private final Map<Event, List<EventListener>> customers;

    public NotificationServiceImpl() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    @Override
    public void subscribe(Event eventType, EventListener listener) {
        customers.get(eventType).add(listener);
    }

    @Override
    public void unsubscribe(Event eventType, EventListener listener) {
        customers.get(eventType).remove(listener);
    }

    @Override
    public void notification(Event eventType) {
        customers.get(eventType).forEach(EventListener::update);
    }
}
