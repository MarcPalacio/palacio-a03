/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution34 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution34 solution = new Solution34();
        // Create an array list of employees
        ArrayList<String> listEmployees = new ArrayList<>();
        listEmployees.add("John Smith");
        listEmployees.add("Jackie Johnson");
        listEmployees.add("Chris Jones");
        listEmployees.add("Amanda Cullen");
        listEmployees.add("Jeremy Goodwin");

        // Print out arraylist of employees
        System.out.println("There are " + listEmployees.size() + " employees:");
        for(int i = 0; i < listEmployees.size(); i++){
            System.out.println(listEmployees.get(i));
        }
        System.out.println();

        // calls askName which stores the string of the name the user wants to remove from list
        String remove = solution.askName("Enter a employee name to remove: ");

        // calls removeName which takes in the list of employees and name of the employee to remove
        ArrayList<String> newListEmployees = solution.removeName(listEmployees, remove);

        // prints out the new list of employees
        System.out.println();
        System.out.println("There are " + newListEmployees.size() + " employees:");
        for(int i = 0; i < newListEmployees.size(); i++){
            System.out.println(newListEmployees.get(i));
        }
    }

    private String askName(String question){
        // Asks the user a question (in this case, which employee to remove from the list)
        // Then returns that name
        System.out.print(question);
        return in.nextLine();
    }

    public ArrayList<String> removeName(ArrayList<String> list, String name){
        // Run through the list of employees
        // if employee at the current index equals the name of the employee to remove
        // remove that name

        // Originally had the code go through all elements and remove each instance instead of the first instance
        // In a case where two people have the same name, but you are only trying to remove one,
        // .remove(name) can be used to ensure only one name is removed (though it should be specified at that point)
        list.remove(name);
        // return the new arrayList
        return list;
    }
}
