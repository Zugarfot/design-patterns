package com.company;

import java.util.ArrayList;


public class NotificationSender implements Observable {
    private ArrayList<Notification > allNotifications;
    private ArrayList<Observer> observers;

    public NotificationSender()
    {
        allNotifications = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addNotification(Notification n){
        allNotifications.add(n);
        post();
    }

    public ArrayList<Notification> getState()
    {
        return allNotifications;
    }

    @Override
    public void join(Observer o) { observers.add(o);

    }

    @Override
    public void leave(Observer o) { observers.remove(o);

    }

    @Override
    public void post() {
        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(this);
        }
    }
}
