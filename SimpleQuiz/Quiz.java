import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
  private List<Question> questions;

  public Quiz() {
    questions = new ArrayList<>();

    questions
        .add(new Question("What is the largest planet in our solar system?", List.of("Mars", "Jupiter", "Saturn"), 1));
    questions.add(new Question("What is the capital of France?", List.of("Paris", "London", "Berlin"), 0));
    questions.add(new Question("What is the chemical symbol for gold?", List.of("Ag", "Au", "Cu"), 1));
    questions.add(new Question("Who painted the Mona Lisa?",
        List.of("Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso"), 0));
    questions
        .add(new Question("What is the largest mammal in the world?", List.of("Elephant", "Giraffe", "Blue Whale"), 2));
    questions.add(new Question("What is the highest mountain in the world?",
        List.of("Mount Everest", "K2", "Mount Kilimanjaro"), 0));
    questions.add(
        new Question("What is the smallest country in the world?", List.of("Vatican City", "Monaco", "San Marino"), 0));
    questions.add(new Question("What is the largest ocean in the world?",
        List.of("Pacific Ocean", "Atlantic Ocean", "Indian Ocean"), 0));
    questions.add(new Question("What is the capital of Australia?", List.of("Sydney", "Melbourne", "Canberra"), 2));
    questions.add(new Question("What is the currency of Japan?", List.of("Yen", "Dollar", "Euro"), 0));
    questions
        .add(new Question("What is the capital of Brazil?", List.of("Rio de Janeiro", "Sao Paulo", "Brasilia"), 2));
    questions.add(new Question("What is the capital of Canada?", List.of("Toronto", "Vancouver", "Ottawa"), 2));
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void shuffleQuestions() {
    Collections.shuffle(questions);
  }
}
