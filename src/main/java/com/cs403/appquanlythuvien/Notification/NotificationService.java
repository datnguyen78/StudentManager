package com.cs403.appquanlythuvien.Notification;

public class NotificationService {
    public String recipientId;
    public String message;
    public String sendDate;

    public NotificationService(String recipientId, String message, String sendDate) {
        this.recipientId = recipientId;
        this.message = message;
        this.sendDate = sendDate;
    }
     
     public void send() {
        System.out.println(">>> [LOG NOTIFICATION]");
        System.out.println(" To: " + recipientId);
        System.out.println(" Date: " + sendDate);
        System.out.println(" Content: " + message);
        System.out.println(" Status: SENT SUCCESS");
    }
    
}
