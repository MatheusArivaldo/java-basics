import java.util.List;

public class Question {
  private String question;
  private List<String> choices;
  private int correctAnswerIndex;

  public Question(String question, List<String> choices, int correctAnswerIndex) {
    this.question = question;
    this.choices = choices;
    this.correctAnswerIndex = correctAnswerIndex;
  }

  public String getQuestion() {
    return question;
  }

  public List<String> getChoices() {
    return choices;
  }

  public int getCorrectAnswerIndex() {
    return correctAnswerIndex;
  }
}
