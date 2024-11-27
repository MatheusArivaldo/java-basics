package WordCounter;

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
}
