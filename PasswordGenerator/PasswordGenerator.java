package PasswordGenerator;

public class PasswordGenerator {
  private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  private static final String CHARACTERS_WITH_SPECIAL_CHARS = CHARACTERS + "!@#$%^&*()_";

  public static String generatePassword(int length, boolean includeSpecialChars) {
    StringBuilder password = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int randomIndex = (int) (Math.random() * characters(includeSpecialChars).length());
      password.append(characters(includeSpecialChars).charAt(randomIndex));
    }
    return password.toString();
  }

  private static String characters(boolean includeSpecialChars) {
    return includeSpecialChars ? CHARACTERS_WITH_SPECIAL_CHARS : CHARACTERS;
  }
}
