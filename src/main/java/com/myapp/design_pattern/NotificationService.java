package com.myapp.design_pattern;

public interface NotificationService {
    void subscribe(Event eventType, EventListener listener);
    void unsubscribe(Event eventType, EventListener listener);
    void notification(Event eventType);

}
