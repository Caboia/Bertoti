package com.example.model;

import com.example.observer.TaskObserver;

public interface Subject {
    void registerObserver(TaskObserver observer);
    void deleteObserver(TaskObserver observer);
    void notifyObservers();
}
