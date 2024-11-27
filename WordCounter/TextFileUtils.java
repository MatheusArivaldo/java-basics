package WordCounter;

import java.io.File;

public class TextFileUtils {
  private static File readFile() {
    File file;
    String path = "D:\\Back-end Roadmap\\WordCounter\\sample.txt";

    while (true) {
      try {
        file = new File(path);

        return file;
      } catch (NullPointerException e) {
        ConsoleUtils.print("File cannot be null. Please try again.");
      } catch (Exception e) {
        ConsoleUtils.print("Invalid file. Please try again.");
      }
    }
  }

  private static boolean isValidTextFile(File file) {
    if (!file.exists()) {
      ConsoleUtils.print("File does not exist. Please try again.");
      return false;
    }

    if (!file.isFile()) {
      ConsoleUtils.print("File is not a file. Please try again.");
      return false;
    }

    if (!file.canRead()) {
      ConsoleUtils.print("File is not readable. Please try again.");
      return false;
    }

    if (!file.getName().endsWith(".txt")) {
      ConsoleUtils.print("File is not a text file. Please try again.");
      return false;
    }

    return true;
  }

  public static File GetTextFile() {
    File file = readFile();
    while (!isValidTextFile(file)) {
      ConsoleUtils.print("Invalid file. Please try again.");
      file = readFile();
    }
    return file;
  }
}
