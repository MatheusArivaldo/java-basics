package ContactBook;

import java.util.HashMap;
import java.util.List;

public class CommandLine {
  public final static List<String> COMMANDS = List.of("add", "remove", "list", "exit", "help");

  public static boolean isValidCommand(String command) {
    return COMMANDS.contains(command.toLowerCase());
  }

  public static void printHelp() {
    ConsoleUtils.print("");
    ConsoleUtils.print("Type 'add' to add a contact, 'remove' to remove a contact, 'list' to list all contacts.");
    ConsoleUtils.print("Enter 'exit' to exit the program.");
    ConsoleUtils.print("Type 'help' to see this message again.");
    ConsoleUtils.print("");
  }

  public static void addCommand(ContactBook contactBook) {
    ConsoleUtils.print("");
    String name = ConsoleUtils.readName("Enter the name of the contact: ");

    int phoneNumber = ConsoleUtils.readPhoneNumber("Enter the phone number of the contact: ");

    if (contactBook.addContact(name, phoneNumber)) {
      ConsoleUtils.print("Contact added successfully");
    }
    ConsoleUtils.print("");
  }

  public static void removeCommand(ContactBook contactBook) {
    ConsoleUtils.print("");
    String name = ConsoleUtils.readName("Enter the name of the contact to remove: ").trim().toLowerCase();

    if (contactBook.removeContact(name)) {
      ConsoleUtils.print("Contact removed successfully");
    }
    ConsoleUtils.print("");
  }

  public static void listCommand(ContactBook contactBook) {
    ConsoleUtils.print("");
    ConsoleUtils.print("Contacts: ");
    HashMap<String, Integer> contacts = contactBook.getContacts();

    for (String name : contacts.keySet()) {
      ConsoleUtils.print(name + ": " + contacts.get(name));
    }
    ConsoleUtils.print("");
  }
}
