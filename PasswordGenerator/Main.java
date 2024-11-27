package PasswordGenerator;

public class Main {
  public static void main(String[] args) {
    ConsoleUtils.print("Welcome to the Password Generator!");
    int length = ConsoleUtils.readInt("Enter the length of the password: ");
    boolean includeSpecialChars = ConsoleUtils.readBoolean("Include special characters? (yes/no): ");
    String password = PasswordGenerator.generatePassword(length, includeSpecialChars);
    ConsoleUtils.print("Generated Password: " + password);
    ConsoleUtils.print("Thank you for using the Password Generator!");
  }
}
