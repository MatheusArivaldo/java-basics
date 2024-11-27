import java.util.ArrayList;
import java.util.List;

public class TaskManager {
  private final List<Task> tasks;

  public TaskManager() {
    tasks = new ArrayList<>();
  }

  public void add(Task task) {
    tasks.add(task);
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public List<Task> getCompletedTasks() {
    List<Task> completedTasks = new ArrayList<>();
    for (Task task : tasks) {
      if (task.isCompleted()) {
        completedTasks.add(task);
      }
    }
    return completedTasks;
  }

  public List<Task> getUncompletedTasks() {
    List<Task> uncompletedTasks = new ArrayList<>();
    for (Task task : tasks) {
      if (!task.isCompleted()) {
        uncompletedTasks.add(task);
      }
    }
    return uncompletedTasks;
  }
}
