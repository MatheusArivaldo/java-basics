package ContactBook;

public class Main {
  public static void main(String[] args) {
    ContactBook contactBook = new ContactBook();

    ConsoleUtils.print("Welcome to the Contact Book!");
    CommandLine.printHelp();

    while (true) {

      String command = ConsoleUtils.readLine("Enter a command: ");
      if (CommandLine.isValidCommand(command)) {
        switch (command.toLowerCase()) {
          case "add":
            CommandLine.addCommand(contactBook);
            break;
          case "remove":
            CommandLine.removeCommand(contactBook);
            break;
          case "list":
            CommandLine.listCommand(contactBook);
            break;
          case "exit":
            ConsoleUtils.print("Goodbye!");
            return;
          case "help":
            CommandLine.printHelp();
            break;
          default:
            ConsoleUtils.print("Invalid command. Please try again.");
        }
      }
    }
  }
}
