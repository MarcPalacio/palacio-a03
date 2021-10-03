/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution33 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution33 solution = new Solution33();
        // Stores an arrayList of answers
        ArrayList<String> listAnswer = new ArrayList<String>();
        listAnswer.add("Yes.");
        listAnswer.add("No.");
        listAnswer.add("Maybe.");
        listAnswer.add("Ask again later.");

        // Calls askQuestion to get a question
        // Since you aren't doing anything with the question
        // askQuestion will be a void
        solution.askQuestion("What's your question?\n > ");
        // Calls randomNum to get a number to get an answer from the arrayList of answers
        int answer = solution.randomNum();
        String response = listAnswer.get(answer);
        // Prints out answer
        System.out.println(response);
    }

    private void askQuestion(String question){
        // Prompts the user for a question and
        // makes the user input a question
        System.out.print(question);
        in.nextLine();
        System.out.println();
    }

    public int randomNum(){
        Random rand = new Random();
        // returns a random number between 0-3
        return rand.nextInt(4);
    }
}
