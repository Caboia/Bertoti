package com.example.view;

import com.example.model.Subject;
import com.example.model.Task;
import com.example.model.TaskModel;  // Adicione esta importação
import com.example.controller.TaskControllerInterface;
import com.example.observer.TaskObserver;

public class TaskView implements TaskObserver {
    private Subject model;
    private TaskControllerInterface controller;
    private String taskList;

    public TaskView(Subject model, TaskControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        this.taskList = "";
        model.registerObserver(this);
    }

    public void displayTasks() {
        for (Task task : ((TaskModel) model).getTasks()) {
            taskList += task.getName() + ": " + task.getDescription() + "\n";
        }
        System.out.println(taskList);
    }

    @Override
    public void update() {
        taskList = "";
        displayTasks();
    }
}
