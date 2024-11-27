package ContactBook;

public class ConsoleUtils {
  private static final String NAME_REGEX = "^[A-Za-z\\s]+$";

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

  public static String readName(String message) {
    String name = readLine(message);
    while (name.isEmpty() || !name.matches(NAME_REGEX)) {
      print("Name cannot be empty. Please enter a valid name.");
      name = readLine(message);
    }
    return name;
  }

  public static int readPhoneNumber(String message) {
    while (true) {
      try {
        int phoneNumber = Integer.parseInt(readLine(message));
        if (phoneNumber < 0) {
          print("Phone number cannot be negative. Please enter a valid phone number.");
        } else {
          return phoneNumber;
        }
      } catch (NumberFormatException e) {
        print("Invalid phone number format. Please enter a valid phone number.");
      }
    }
  }
}
