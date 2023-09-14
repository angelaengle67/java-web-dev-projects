import java.util.ArrayList;

public class MultipleChoice extends Question{
    public String answer;

    public MultipleChoice(String text, ArrayList<String> possibleAnswers, String answer) {
        super(text, possibleAnswers);
        this.answer = answer;
    }

    public boolean isCorrect(){
        return true;
    };
}
