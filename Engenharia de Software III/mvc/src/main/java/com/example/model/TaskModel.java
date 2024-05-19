package com.example.model;

import com.example.observer.TaskObserver;
import java.util.ArrayList;
import java.util.List;

public class TaskModel implements Subject {
    private List<TaskObserver> observers;
    private List<Task> tasks;

    public TaskModel() {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update();
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
        notifyObservers();
    }

    public void markTaskAsCompleted(Task task) {
        // Implementação de marcar como concluída
        notifyObservers();
    }

    public void updateTask(Task task) {
        // Implementação de atualização de tarefa
        notifyObservers();
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
