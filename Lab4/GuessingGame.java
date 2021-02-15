package Lab4;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int userGuess;
        int correctGuess;

        System.out.print("Guess a number between 1 and 99: ");
        Random rand = new Random();
        correctGuess = rand.nextInt(100);
        System.out.print(correctGuess);
        int i = 0;
        while (i < 10){
            userGuess = scn.nextInt();
            if(userGuess == correctGuess){
                System.out.println(correctGuess + " is the correct number!");
            }else if(userGuess > correctGuess){
                System.out.println("Wrong number! The correct number is lower. You have " + (9 - i) + " guesses left");
                i++;
            }else if(userGuess < correctGuess){
                System.out.println("Wrong number! The correct number is higher. You have " + (9 - i) + " guesses left.");
                i++;
            }
        }
        if(i == 10){
            System.out.println("You have run out of guesses. The correct answer was: " + correctGuess);
            System.out.println(":(");
        }
        scn.close();
    }
}
