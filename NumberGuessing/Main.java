package NumberGuessing;

public class Main {
  public static void main(String[] args) {
    ConsoleUtils.print("Welcome to the Number Guessing Game!");

    Game game = new Game();

    game.choseDifficulty();

    ConsoleUtils.print("You have chosen the difficulty level: " + game.getDifficulty());

    game.chosePlayerNumber();

    ConsoleUtils.print("You have chosen the number: " + game.getPlayerNumber());

    game.generateRandomNumber();

    if (game.checkWin()) {
      ConsoleUtils.print("You won! The number was " + game.getRandomNumber());
    } else {
      ConsoleUtils.print("You lost! The number was " + game.getRandomNumber());
    }

    ConsoleUtils.print("Thank you for playing the Number Guessing Game!");
  }
}
