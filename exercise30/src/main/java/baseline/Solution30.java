/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution30 {
    public static void main(String[] args){
        // calls the createMultiplicationTable and prints it out
        Solution30 solution = new Solution30();
        System.out.println(solution.createMultiplicationTable());
    }

    public String createMultiplicationTable(){
        StringBuilder string = new StringBuilder();
        // have one loop control the row
        for(int i = 1; i <= 12; i++){
            // have one loop control the column
            for(int j = 1; j <= 12; j++){
                if(i*j > 99){
                    // if i*j is 3 digits
                    //      return i*j where the indent is only 2 spaces
                    string.append("  " + i*j);
                } else if(i*j > 9){
                    // if i*j is 2 digits
                    //      return i*j where the indent is only 3 spaces
                    string.append("   " + i*j);
                } else if(i*j < 10){
                    // if i*j is 1 digits
                    //      return i*j where the indent is only 4 spaces
                    string.append("    " + i*j);
                }
                // if the column equals 12 and row does not equal 12
                //      *This is to ensure that a new line doesn't get created at the end
                //      add a new line to the output
                if(j == 12 && i != 12){
                    string.append("\n");
                }
            }
        }
        return string.toString();
    }
}