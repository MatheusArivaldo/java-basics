public class Main {
  public static void main(String[] args) {
    ConsoleUtils.clear();
    ConsoleUtils.print("Welcome to the Task Manager!");
    CommandLine.printHelp();

    TaskManager taskManager = new TaskManager();

    while (true) {
      ConsoleUtils.EmptyLine();
      String command = ConsoleUtils.readLine("Enter command: ");
      if (CommandLine.isCommand(command)) {
        if (command.equals("add")) {
          CommandLine.addCommand(taskManager);
        } else if (command.equals("list")) {
          CommandLine.listCommand(taskManager);
        } else if (command.equals("complete")) {
          CommandLine.completeCommand(taskManager);
        } else if (command.equals("exit")) {
          ConsoleUtils.clear();
          ConsoleUtils.print("Goodbye!");
          break;
        } else if (command.equals("help")) {
          CommandLine.printHelp();
        }
      }
    }
  }
}