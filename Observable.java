package com.company;

public interface Observable {
    void join(Observer o);
    void leave(Observer o);
    void post();
}
