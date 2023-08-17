import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into" +
                " a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = hiddenFigures.toCharArray();

        HashMap<Character, Integer> count = new HashMap<>();
        for (Character character : charactersInString) {
            if(count.containsKey(character)){
                count.put(character, count.get(character) +1);
            } else {
                count.put(character, 1);
            }

        }
        System.out.println(count);
    }


}

