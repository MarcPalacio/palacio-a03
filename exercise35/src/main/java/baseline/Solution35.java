/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution35 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution35 solution = new Solution35();
        // create arraylist of names
        ArrayList<String> names = new ArrayList<>();
        String name = "";
        // while the name does not equal an empty string
        do{
            // calls askName to get a name from the user
            name = solution.askName("Enter a name: ");
            if(!(name.equals(""))){
                // if the name does not equal an empty string
                //      add the name to the arraylist
                names.add(name);
            } else {
                // else
                //      end the loop
                break;
            }
        }while(!(name.equals("")));

        // calls get randomNum which passes the list as a parameter
        int winner = solution.randomNum(names);
        // prints out the winner based on the random number generated
        System.out.println("The winner is... " + names.get(winner));
    }

    private String askName(String question){
        // Asks the user for a name
        System.out.print(question);
        // returns that name
        return in.nextLine();
    }

    public int randomNum(ArrayList<String> list){
        Random rand = new Random();
        // Generates a random number based off the size of the list
        // Returns that number
        return rand.nextInt(list.size());
    }
}
