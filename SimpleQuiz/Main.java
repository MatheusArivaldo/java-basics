public class Main {
  public static void main(String[] args) {
    ConsoleUtils.clearScreen();

    ConsoleUtils.printLine("Welcome to the Quiz Game!");
    ConsoleUtils.emptyLine();

    Quiz quiz = new Quiz();
    quiz.shuffleQuestions();
    int score = 0;

    for (Question question : quiz.getQuestions()) {
      ConsoleUtils.emptyLine();
      ConsoleUtils.printLine(question.getQuestion());
      for (int i = 0; i < question.getChoices().size(); i++) {
        ConsoleUtils.printLine((i + 1) + ". " + question.getChoices().get(i));
      }

      ConsoleUtils.emptyLine();

      int answer = ConsoleUtils.readInt("Enter your answer (1-3): ", 1, 3,
          "Invalid answer. Please enter a number between 1 and 3.");

      if (answer == question.getCorrectAnswerIndex() + 1) {
        ConsoleUtils.printLine("Correct!");
        score++;
      } else {
        ConsoleUtils.printLine("Incorrect. The correct answer is " + (question.getCorrectAnswerIndex() + 1) + ".");
      }
    }

    ConsoleUtils.emptyLine();
    ConsoleUtils.printLine("You scored " + score + " out of " + quiz.getQuestions().size() + " questions.");
  }
}
