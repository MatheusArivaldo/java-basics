public class ConsoleUtils {
  public static void print(String message) {
    System.out.println(message);
  }

  public static void EmptyLine() {
    System.out.println(" ");
  }

  public static String readLine(String message) {
    print(message);
    return System.console().readLine().trim().toLowerCase();
  }

  public static void clear() {
    System.out.print("\033[H\033[2J");
  }

  public static int readInt(String message, int min, int max, String errorMessage) {
    try {
      int number = Integer.parseInt(readLine(message));
      if (number < min || number > max) {
        print(errorMessage);
        return readInt(message, min, max, errorMessage);
      }
      return number;
    } catch (NumberFormatException e) {
      print(errorMessage);
      return readInt(message, min, max, errorMessage);
    }
  }

  public static int readChoice(String message, String[] options, String errorMessage) {
    try {
      print(message);

      int choice = Integer.parseInt(System.console().readLine());
      if (choice < 1 || choice > options.length) {
        print(errorMessage);
        return readChoice(message, options, errorMessage);
      }
      return choice;
    } catch (NumberFormatException e) {
      print(errorMessage);
      return readChoice(message, options, errorMessage);
    }
  }
}
