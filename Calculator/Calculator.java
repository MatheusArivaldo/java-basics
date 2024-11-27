package Calculator;

public class Calculator {
  public static double calculate(double num1, String operator, double num2) {
    switch (operator) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "*":
        return num1 * num2;
      case "/":
        return num1 / num2;
      default:
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
  }
}
