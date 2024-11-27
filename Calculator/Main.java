package Calculator;

class Main {

  public static void main(String[] args) {
    ConsoleUtils.print("Welcome to the Calculator!");

    double num1 = ConsoleUtils.readDouble("Enter the first number: ");
    String operator = ConsoleUtils.readOperator("Enter the operator (+, -, *, /): ");
    double num2 = ConsoleUtils.readDouble("Enter the second number: ");

    double result = Calculator.calculate(num1, operator, num2);
    ConsoleUtils.print("The result is: " + result);

    ConsoleUtils.print("Thank you for using the Calculator!");
  }
}