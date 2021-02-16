package Lab4;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int userGuess;
        int correctGuess;

        System.out.print("Guess a number between 1 and 100: ");
        Random rand = new Random();
        correctGuess = rand.nextInt(100) + 1;
        
        int i = 0;
        while (i < 10001){
            userGuess = scn.nextInt();
            if(userGuess == correctGuess){
                System.out.print(correctGuess + " is the correct number! It took you " + (i+1) + " guesses to get the answer.");
            }else if(userGuess > correctGuess){
                System.out.println("Wrong number! The correct number is lower.");
                i++;
            }else if(userGuess < correctGuess){
                System.out.println("Wrong number! The correct number is higher.");
                i++;
            }
        }
        scn.close();
    }
}
