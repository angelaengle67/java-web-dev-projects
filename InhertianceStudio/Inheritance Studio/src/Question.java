import java.util.ArrayList;
abstract public class Question {
    private String text;
    private ArrayList <String> possibleAnswers;


    public Double grading(){
        Double score = 0.0;
        return score;
    };

    public void printQuestions(){};

    public void printPossibleAnswers(){};
    abstract public boolean isCorrect();

}
