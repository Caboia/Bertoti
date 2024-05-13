class TaskController {
  private Model model;
  private View view;

  public TaskController(Model model, View view) {
      this.model = model;
      this.view = view;
  }

  public void addTask(Task task) {
      model.addTask(task);
      view.updateView();
  }

  public void deleteTask(Task task) {
      model.deleteTask(task);
      view.updateView();
  }

  public void markTaskAsCompleted(Task task) {
      model.markTaskAsCompleted(task);
      view.updateView();
  }

  public void updateTask(Task task) {
      model.updateTask(task);
      view.updateView();
  }
}