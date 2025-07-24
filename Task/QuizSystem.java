import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizSystem {
    private List<Question> questions;
    private int score;
    private int currentQuestionIndex;

    public QuizSystem() {
        questions = new ArrayList<>();
        score = 0;
        currentQuestionIndex = 0;

        // Add questions to the system
        addQuestion("What is the capital of France?", "Paris", "London", "Berlin", "Rome", "Paris");
        addQuestion("What is the largest planet in our solar system?", "Earth", "Saturn", "Jupiter", "Uranus", "Jupiter");
        addQuestion("What is the smallest country in the world?", "Vatican City", "Monaco", "Nauru", "Tuvalu", "Vatican City");
    }

    private void addQuestion(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
        Question q = new Question(question, option1, option2, option3, option4, correctAnswer);
        questions.add(q);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        while (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            System.out.println("Question " + (currentQuestionIndex + 1) + ": " + currentQuestion.getQuestion());
            System.out.println("A) " + currentQuestion.getOption1());
            System.out.println("B) " + currentQuestion.getOption2());
            System.out.println("C) " + currentQuestion.getOption3());
            System.out.println("D) " + currentQuestion.getOption4());

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    scanner.next(); // consume the newline left-over
                }
            }, 30000); // 30 seconds

            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + currentQuestion.getCorrectAnswer());
            }

            currentQuestionIndex++;
        }

        System.out.println("Quiz complete! Your score is " + score + " out of " + questions.size());
        System.out.println("Correct answers:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ": " + questions.get(i).getCorrectAnswer());
        }
    }

    public static void main(String[] args) {
        QuizSystem quizSystem = new QuizSystem();
        quizSystem.startQuiz();
    }
}

class Question {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;

    public Question(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}