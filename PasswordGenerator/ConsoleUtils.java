package PasswordGenerator;

public class ConsoleUtils {
  public static void print(String message) {
    System.out.println(message);
  }

  public static String readLine() {
    return System.console().readLine();
  }

  public static String readLine(String message) {
    print(message);
    return readLine();
  }

  public static int readInt(String message) {
    try {
      return Integer.parseInt(readLine(message));
    } catch (NumberFormatException e) {
      print("Invalid number format. Please enter a valid integer.");
      return readInt(message);
    }
  }

  public static boolean readBoolean(String message) {
    String input = readLine(message);
    return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
  }
}
