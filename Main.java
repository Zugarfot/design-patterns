package com.company;

public class Main {

    public static void main(String[] args) {
        NotificationSender notificationSender = new NotificationSender();
        Subscriber BabaPenka = new Subscriber("BabaPenka");
        Subscriber Pencho = new Subscriber(("Pencho"));
        Notification n = new Notification("Hlqb",2);

        notificationSender.join(BabaPenka);
        notificationSender.join(Pencho);

        notificationSender.addNotification(n);
    }
}
