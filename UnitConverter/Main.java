package UnitConverter;

public class Main {
  public static void main(String[] args) {
    ConsoleUtils.print("Welcome to the Unit Converter!");

    String fromUnit = null;
    String toUnit = null;
    while (true) {
      fromUnit = ConsoleUtils.readLine("Enter the unit to convert from (celsius, fahrenheit, kelvin): ");
      if (UnitUtils.isValidUnit(fromUnit)) {
        break;
      } else {
        ConsoleUtils.print("Invalid unit. Please try again.");
      }
    }

    while (true) {
      toUnit = ConsoleUtils.readLine("Enter the unit to convert to (celsius, fahrenheit, kelvin): ");
      if (UnitUtils.isValidUnit(toUnit)) {
        break;
      } else {
        ConsoleUtils.print("Invalid unit. Please try again.");
      }
    }

    double value = ConsoleUtils.readDouble("Enter the value to convert: ");

    double result = UnitUtils.ConvertUnit(value, fromUnit, toUnit);

    ConsoleUtils.print("The converted value is: " + result);

    ConsoleUtils.print("Thank you for using the Unit Converter!");
  }
}
