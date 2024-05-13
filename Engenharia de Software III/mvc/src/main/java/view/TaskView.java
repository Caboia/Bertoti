import java.util.ArrayList;
import java.util.List;

interface View {
  void displayTasks();
  void updateView();
}

class TaskView implements View {
  private List<Task> tasks;

  public TaskView(List<Task> tasks) {
      this.tasks = tasks;
  }

  @Override
  public void displayTasks() {
      for (Task task : tasks) {
          System.out.println(task.getDescription() + " - Completed: " + task.isCompleted());
      }
  }

  @Override
  public void updateView() {
      // Update view
  }
}