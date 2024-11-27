package Calculator;

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

  public static double readDouble(String message) {
    try {
      return Double.parseDouble(readLine(message));
    } catch (NumberFormatException e) {
      print("Invalid number format. Please enter a valid number.");
      return readDouble(message);
    }
  }

  public static String readOperator(String message) {
    String operator = readLine(message);
    while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
      print("Invalid operator. Please enter a valid operator (+, -, *, /).");
      operator = readLine(message);
    }
    return operator;
  }
}
