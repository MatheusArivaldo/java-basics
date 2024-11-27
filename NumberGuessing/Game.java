package NumberGuessing;

public class Game {
  private int difficulty;
  private int playerNumber;
  private int randomNumber;

  public Game() {
  }

  public int getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(int difficulty) {
    this.difficulty = difficulty;
  }

  public void choseDifficulty() {
    String message = "Choose the difficulty level: (1) Easy (2) Medium (3) Hard";
    difficulty = ConsoleUtils.choseNumberBetween(1, 3, message);
  }

  public int getNumberByDifficulty() {
    if (difficulty == 1) {
      return 5;
    } else if (difficulty == 2) {
      return 10;
    } else {
      return 15;
    }
  }

  public void generateRandomNumber() {
    randomNumber = (int) (Math.random() * getNumberByDifficulty() + 1);
  }

  public int getRandomNumber() {
    return randomNumber;
  }

  public void chosePlayerNumber() {
    playerNumber = ConsoleUtils.choseNumberBetween(1, getNumberByDifficulty(),
        "Chose a number between 1 and " + getNumberByDifficulty() + ": ");
  }

  public int getPlayerNumber() {
    return playerNumber;
  }

  public boolean checkWin() {
    return playerNumber == randomNumber;
  }
}
