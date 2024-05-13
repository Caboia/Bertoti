import java.util.ArrayList;
import java.util.List;

class TaskModel implements Model {
  private List<Task> tasks;

  public TaskModel() {
      this.tasks = new ArrayList<>();
  }

  @Override
  public void addTask(Task task) {
      tasks.add(task);
  }

  @Override
  public void deleteTask(Task task) {
      tasks.remove(task);
  }

  @Override
  public void markTaskAsCompleted(Task task) {
      task.setCompleted(true);
  }

  @Override
  public void updateTask(Task task) {
      // Update task in the model
  }
}