import java.util.List;

public class CommandLine {
  private static String[] commands = { "add", "list", "complete", "exit", "help" };

  public static boolean isCommand(String command) {
    for (String cmd : commands) {
      if (cmd.equals(command)) {
        return true;
      }
    }
    return false;
  }

  public static void printHelp() {
    ConsoleUtils.EmptyLine();
    ConsoleUtils.print("Available commands:");
    for (String cmd : commands) {
      System.out.println(cmd);
    }
    ConsoleUtils.EmptyLine();
  }

  public static void addCommand(TaskManager taskManager) {
    ConsoleUtils.clear();
    String title = ConsoleUtils.readLine("Enter title: ");
    String description = ConsoleUtils.readLine("Enter description: ");
    Task task = new Task(title, description);
    taskManager.add(task);
    ConsoleUtils.print("Task added.");
    ConsoleUtils.EmptyLine();
  }

  public static void listCommand(TaskManager taskManager) {
    ConsoleUtils.clear();

    int choice = ConsoleUtils.readChoice("1. Uncompleted\n2. Completed\n3. All\n", new String[] { "1", "2", "3" },
        "Invalid choice, please try again.");
    switch (choice) {
      case 1:
        ConsoleUtils.print("Uncompleted tasks:");
        for (Task task : taskManager.getUncompletedTasks()) {
          PrintTask(task);
        }
        break;
      case 2:
        ConsoleUtils.print("Completed tasks:");
        for (Task task : taskManager.getCompletedTasks()) {
          PrintTask(task);
        }
        break;
      case 3:
        ConsoleUtils.print("All tasks:");
        for (Task task : taskManager.getTasks()) {
          PrintTask(task);
        }
        break;
    }
  }

  public static void completeCommand(TaskManager taskManager) {
    ConsoleUtils.clear();
    String title = ConsoleUtils.readLine("Enter title: ");
    List<Task> tasks = taskManager.getUncompletedTasks();
    if (tasks.isEmpty()) {
      ConsoleUtils.print("No uncompleted tasks found.");
      return;
    }

    for (Task task : tasks) {
      if (task.getTitle().equals(title)) {
        task.complete();
        ConsoleUtils.print("Task completed.");
        return;
      }
    }
    ConsoleUtils.print("Task not found.");
  }

  private static void PrintTask(Task task) {
    ConsoleUtils.EmptyLine();
    ConsoleUtils.print(task.getTitle());
    ConsoleUtils.print(task.getDescription());
    ConsoleUtils.print(task.isCompleted() ? "Completed" : "Not completed");
    ConsoleUtils.EmptyLine();
  }
}
