package com.myapp.design_pattern;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationServiceImpl();
    }

    public void itemPromotion(Event promotionType) {
        notificationService.notification(promotionType);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
