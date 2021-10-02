/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution24 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // Print statement asking for two strings
        // Calls askString that will return a String
        // Calls function isAnagram that will return true or false
        // Prints out if the two strings are anagrams based on the result of isAnagram
        Solution24 solution = new Solution24();
        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        String string1 = solution.askString("Enter the first string: ");
        String string2 = solution.askString("Enter the second string: ");
        boolean anagramCheck = solution.isAnagram(string1, string2);
        if(anagramCheck){
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams");
        }
        else{
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams");
        }
    }

    private String askString(String question){
        // Asks and return the user input (string)
        System.out.print(question);
        return in.nextLine();
    }

    public boolean isAnagram(String input1, String input2){
        // Sets return value to true by default
        // Creates an arraylist for each input
        // Remove any spaces since they do not count as letters
        // Sort the arraylist
        // if an element in the arraylist at the index doesn't match
        //      set the return value to false
        // returns the return value (should be a true or false)
        boolean output = true;
        ArrayList<Character> arrayList1 = formatArrayList(input1);
        ArrayList<Character> arrayList2 = formatArrayList(input2);
        if(arrayList1.size() == arrayList2.size()){
            for(int i = 0; i < arrayList1.size()-1; i++){
                if(arrayList1.get(i) != arrayList2.get(i)){
                    output = false;
                }
            }
        }
        else{
            output = false;
        }
        return output;
    }

    public ArrayList<Character> formatArrayList(String input){
        ArrayList<Character> output = new ArrayList<>();
        // Adds each character of the string into the arraylist
        // Sets chars all to lowercase
        // Sorts the arraylist
        // Returns arraylist
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                output.add(Character.toLowerCase(input.charAt(i)));
            }
        }
        Collections.sort(output);
        return output;
    }
}
