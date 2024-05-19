package com.example;

import com.example.controller.TaskController;
import com.example.model.Task;
import com.example.model.TaskModel;
import com.example.view.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView(model, null);
        TaskController controller = new TaskController(model, view);

        view = new TaskView(model, controller);

        Task task1 = new Task("Criar o banco de dados", "Fazer o banco de dados do projeto, seguindo o modelo apresentado na aula.");
        Task task2 = new Task("Criar o código do projeto", "Fazer o código do projeto em Typescript, seguindo todos os requisitos.");

        controller.addTask(task1);
        controller.addTask(task2);

        controller.deleteTask(task1);
    }
}
