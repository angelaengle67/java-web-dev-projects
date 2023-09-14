import java.util.ArrayList;
abstract public class Question {
    private String text;
    private ArrayList <String> possibleAnswers;

    public Question(String text, ArrayList<String> possibleAnswers) {
        this.text = text;
        this.possibleAnswers = possibleAnswers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public Double grading(){
        Double score = 0.0;
        return score;
    };
    public void printQuestions(){

            System.out.println(text);
        }


    public void printPossibleAnswers(){
        for(String answers : possibleAnswers){
            System.out.println(answers);
        }
    };
    abstract public boolean isCorrect();

}
