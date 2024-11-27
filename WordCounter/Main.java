package WordCounter;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    ConsoleUtils.print("Welcome to the Word Counter!");

    File file = TextFileUtils.GetTextFile();
    WordCounter wordCounter = new WordCounter(file);

    ConsoleUtils.print("Number of characters: " + wordCounter.countCharacters());
    ConsoleUtils.print("Number of words: " + wordCounter.countWords());
    ConsoleUtils.print("Number of lines: " + wordCounter.countLines());

    ConsoleUtils.print("Thank you for using the Word Counter!");
  }
}
