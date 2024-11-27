package WordCounter;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WordCounter {
  private final File FILE;

  public WordCounter(File file) {
    FILE = file;
  }

  public int countCharacters() {
    int count = 0;
    try (Scanner scanner = new Scanner(new FileInputStream(FILE))) {
      while (scanner.hasNext()) {
        count += scanner.next().length();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return count;
  }

  public int countWords() {
    int count = 0;
    try (Scanner scanner = new Scanner(new FileInputStream(FILE))) {
      while (scanner.hasNext()) {
        scanner.next();
        count++;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return count;
  }

  public int countLines() {
    int count = 0;
    try (Scanner scanner = new Scanner(new FileInputStream(FILE))) {
      while (scanner.hasNextLine()) {
        scanner.nextLine();
        count++;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return count;
  }
}
