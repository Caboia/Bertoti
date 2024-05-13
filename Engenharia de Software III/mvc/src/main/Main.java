public class Main {
  public static void main(String[] args) {
      TaskModel model = new TaskModel();

      Task task1 = new Task("Task 1");
      Task task2 = new Task("Task 2");

      model.addTask(task1);
      model.addTask(task2);

      TaskView view = new TaskView(model.getTasks());

      TaskController controller = new TaskController(model, view);

      view.displayTasks();
  }
}