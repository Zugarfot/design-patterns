package com.company;

import java.util.ArrayList;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {this.name = name;}

    public void checkNotification(ArrayList<Notification> m) {
        for (int i = 0; i < m.size(); i++)
        {
            if (name.compareTo(m.get(i).name) == 0)
                System.out.println(name + ": " + m.get(i));
        }
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof NotificationSender)
        {
            NotificationSender notsender = (NotificationSender) obj;
            checkNotification(notsender.getState());
        }
    }
}
