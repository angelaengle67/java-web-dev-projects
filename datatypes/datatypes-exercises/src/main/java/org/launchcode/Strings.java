package org.launchcode;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String wonderland = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter search term here:");
        String searchTerm = input.next().toUpperCase();
        boolean isContains = wonderland.toUpperCase().contains(searchTerm);
        System.out.println(isContains);
    }
}