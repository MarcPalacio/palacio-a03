/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution36 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution36 solution = new Solution36();

        // Initialize arraylist of doubles
        ArrayList<Double> numbers = solution.createArrayList();
        //  calls average which will return the average between all the numbers in the arrayList
        double average = solution.average(numbers);
        //  calls max which will return the max value in the arrayList
        double max = solution.max(numbers);
        //  calls min which will return the lowest value in the arrayList
        double min = solution.min(numbers);
        //  calls std which will return the standard deviation of the arrayList
        double std = solution.std(numbers);
        //  calls the buildOutput which will print the results from each calculations
        String output = solution.buildOutput(numbers, average, max, min, std);
        System.out.print(output);
    }

    private String askNumber(String question){
        // Prompts the user with the question of asking for a number
        // returns the string
        System.out.print(question);
        return in.nextLine();
    }

    private ArrayList<Double> createArrayList(){
        // Creates the arrayList and returns it to main
        // Originally wrote this in askNumber, then main, and now here
        ArrayList<Double> nums = new ArrayList<>();
        String input = "a";
        boolean invalidInput = true;
        double num = 0;
        // do while the input isn't done
        do{
            do{ // Try catch loop
                invalidInput = false;
                try{
                    //      Calls askNumber
                    input = askNumber("Enter a number: ");
                    if(input.equals("done")){
                        //  if askNumber does equal done
                        //      end the loop
                        break;
                    } else {
                        //  else askNumber does not equal done
                        //      convert the string to a double (parseDouble)
                        //      add the element to the arrayList
                        num = Double.parseDouble(input);
                        nums.add(num);
                    }
                }catch(NumberFormatException a){ // catches parseDouble in case where it can't parse the string
                    invalidInput = true;
                    System.out.println("That is not a valid input. Please enter a valid input.");
                }
            }while(invalidInput);
        }while(!(input.equals("done")));
        return nums;
    }

    public double average(ArrayList<Double> list){
        // calculates the average of the arrayList
        // Sum of all elements / number of elements
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

    public double max(ArrayList<Double> list){
        // returns the highest value in the arrayList
        return Collections.max(list);
    }

    public double min(ArrayList<Double> list){
        // returns the lowest value in the arrayList
        return Collections.min(list);
    }

    public double std(ArrayList<Double> list){
        // returns the standard deviation of the arrayList
        // Standard Deviation equals
        // The square root of the sum of the difference of each element minus the average squared
        // divided by the number of elements minus 1
        double average = average(list);
        double sum = 0;
        double output = 0;

        // The sum of the difference of each element minus the average squared
        for(int i = 0; i < list.size(); i++){
            sum += Math.pow((list.get(i) - average), 2);
        }

        // Divided by the number of elements minus 1
        output = sum / (list.size());

        // The square root
        return Math.sqrt(output);
    }

    public String buildOutput(ArrayList<Double> list, double average, double max, double min, double std){
        // Builds the output string
        StringBuilder string = new StringBuilder();
        string.append("Numbers:");
        for(int i = 0; i < list.size(); i++){
            string.append(" " + list.get(i));
            if(i != list.size() - 1){
                string.append(",");
            }
        }
        string.append("\n");
        string.append("The average is " + average + "\n");
        string.append("The minimum is " + min + "\n");
        string.append("The maximum is " + max + "\n");
        string.append("The standard deviation is " + std + "\n");

        return string.toString();
    }
}
