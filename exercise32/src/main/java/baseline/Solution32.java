/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

public class Solution32 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution32 solution = new Solution32();
        String playerChoice = "n";
        int diff = 0;
        // Prints out the header
        System.out.println("Let's play Guess the Number!\n");
        // while the user wishes to play (with running at least once)
        do{
            //  call verifyDiff to verify the input of diff
            diff = solution.verifyDiff("Enter the difficulty level (1, 2, or 3): ");

            //  call playGame taking in the difficulty as a parameter
            solution.playGame(diff);
            System.out.println();

            // calls verifyYNN to verify the input of playerChoice
            playerChoice = solution.verifyYNN("Do you wish to play again (Y/N)? ");

            // adds a space between if the user selected to play again
            if(playerChoice.equals("Y")){
                System.out.println();
            }
        }while(playerChoice.equals("Y"));
    }

    private int askDiff(String question){
        // asks the user for an int
        // validates the int
        int output = 0;
        boolean invalidInput = true;
        do{
            invalidInput = false;
            try{
                do{
                    System.out.print(question);
                    output = in.nextInt();
                }while(output <= 0);
            }catch(InputMismatchException e){ // Checks the input to see if it is valid or not
                invalidInput = true;
                in.nextLine();
                System.out.println("That is not a valid difficulty.");
            }
        }while(invalidInput); // Loop while the input is invalid
        return output;
    }

    private String askYNN(String question){
        // Asks the user for a string
        System.out.print(question);
        return in.next();
    }

    private int verifyDiff(String question){
        int diff = 0;
        // while the input does not equal a valid input (1-3 and also will run at least once)
        do{
            //  call askDiff in order to get a valid int
            diff = askDiff(question);

            //  if the input is not within 1-3
            //      print that the input is not a valid difficulty
            if(diff < 1 || diff > 3){
                System.out.println("That is not a valid difficulty.");
            }
        }while(!(diff >= 1 && diff <= 3));
        return diff;
    }

    private String verifyYNN(String question){
        String playerChoice = "";
        // while the input does not equal a valid input (y/Y or n/N and also will run at least once)
        do{
            // call askYNN to get a string
            playerChoice = askYNN(question).toUpperCase();

            // if the input is not "Y" or "N"
            //      print that the input is not "Y" or "N"
            if((!(playerChoice.equals("Y") || playerChoice.equals("N")))){
                System.out.println("Please answer with Y or N.");
            }
        }while((!(playerChoice.equals("Y") || playerChoice.equals("N"))));
        return playerChoice;
    }

    public void playGame(int difficulty){
        // choose a number based on the difficulty the player has chosen
        Random rand = new Random();
        int answer = rand.nextInt(getRange(difficulty)) + 1;
        int playerAnswer = 0;
        int guesses = 0;

        System.out.print("I have my number. What's your guess? ");
        // while the player hasn't guessed the right answer
        do {
            // calls the verification of ints since it can't return two values with askNum (Now askDiff)
            // This allows the non-numeric answers to count as guesses as well
            boolean invalidInput = true;
            do{
                invalidInput = false;
                try{
                    playerAnswer = in.nextInt();
                }catch(InputMismatchException e){ // Checks the input to see if it is valid or not
                    invalidInput = true;
                    guesses++;
                    in.nextLine();
                    System.out.print("That is not a valid input. Guess again: ");
                }
            }while(invalidInput); // Loop while the input is invalid

            //  if the input does not equal the answer
            if(playerAnswer != answer) {
                if(playerAnswer < answer){
                    //  if the input is less than answer
                    //      print that the answer is higher
                    System.out.print("Too low. Guess again: ");
                    guesses++;
                } else if(playerAnswer > answer){
                    //  else if the input is higher than the answer
                    //      print that the answer is lower
                    System.out.print("Too high. Guess again: ");
                    guesses++;
                }
            } else if(playerAnswer == answer){
                //  if the input does equal the answer
                //      print how many guesses it took
                guesses++;
                System.out.print("You got it in " + guesses + "!");
            }
        }while(playerAnswer != answer);
    }

    public int getRange(int difficulty){
        int output = 0;

        if(difficulty == 1){
            // if difficulty is equal to 1
            //      generate a number between 1-10
            output = 10;
        } else if(difficulty == 2){
            // else if difficulty is equal to 2
            //      generate a number between 1-100
            output = 100;
        }else if(difficulty == 3){
            // else if difficulty is equal to 3
            //      generate a number between 1-1000
            output = 1000;
        }

        return output;
    }
}
