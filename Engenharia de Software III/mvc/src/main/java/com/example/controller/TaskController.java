package com.example.controller;

import com.example.model.Task;
import com.example.model.TaskModel;
import com.example.view.TaskView;

public class TaskController implements TaskControllerInterface {
    private TaskModel taskModel;
    private TaskView taskView;

    public TaskController(TaskModel taskModel, TaskView taskView) {
        this.taskModel = taskModel;
        this.taskView = taskView;
    }

    @Override
    public void addTask(Task task) {
        taskModel.addTask(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskModel.deleteTask(task);
    }

    @Override
    public void markTaskAsCompleted(Task task) {
        taskModel.markTaskAsCompleted(task);
    }

    @Override
    public void updateTask(Task task) {
        taskModel.updateTask(task);
    }
}
