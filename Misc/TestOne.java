//Kellen Erskine - Section A - 3/2/2021
package Misc;
import java.util.Scanner;

public class TestOne {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter the values: ");

        int firstValue = scn.nextInt();
        int userInput = 0;
        int numOfPosNums = 0;
        double sumOfNegNums = 0;
        double negCount = 0;

        while(userInput != firstValue){
            userInput = scn.nextInt();
            if(userInput > 0){
                numOfPosNums++;
            }else if(userInput < 0){
                sumOfNegNums = sumOfNegNums + userInput;
                negCount++;
            }
        }
        double avgOfNegNums = sumOfNegNums / negCount;
        System.out.println("Number of non-negative numbers: " + (numOfPosNums));
        System.out.println("Average of negative numbers: " + avgOfNegNums);
        scn.close();
    }
}