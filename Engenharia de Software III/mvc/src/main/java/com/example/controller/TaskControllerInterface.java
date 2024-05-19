package com.example.controller;

import com.example.model.Task;

public interface TaskControllerInterface {
    void addTask(Task task);
    void deleteTask(Task task);
    void markTaskAsCompleted(Task task);
    void updateTask(Task task);
}
