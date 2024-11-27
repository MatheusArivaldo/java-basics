public class ConsoleUtils {
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
  }

  public static void printLine(String line) {
    System.out.println(line);
  }

  public static void emptyLine() {
    System.out.println("");
  }

  public static int readInt(String prompt, int min, int max, String errorMessage) {
    printLine(prompt);
    try {
      int number = Integer.parseInt(System.console().readLine());
      if (number < min || number > max) {
        printLine(errorMessage);
      }
      return number;
    } catch (NumberFormatException e) {
      printLine(errorMessage);
      return readInt(prompt, min, max, errorMessage);
    }
  }
}
