package Misc;
import java.util.Scanner;

public class EvenNums {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the list of integers (negative value ends the list): ");
        int userInput = 0;
        int evenValsNum = 0;
        int evenValsSum = 0;

        while (userInput >= 0){
            userInput = scn.nextInt();
            if (userInput < 0){break;}
            if ((userInput % 2) == 0){
                evenValsNum++;
                evenValsSum += userInput;
            }
        }
        System.out.println("Number of evens: " + evenValsNum);
        System.out.println("Sum of evens: " + evenValsSum);
        scn.close();
    }
}