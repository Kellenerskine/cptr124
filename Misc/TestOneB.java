package Misc;
import java.util.Scanner;

public class TestOneB {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter in some numbers separated by spaces, enter a negative number to finish: ");
        int maxNum = 0;
        int minNum = Integer.MAX_VALUE;
        int userInput = 0;

        while (userInput >= 0){
            userInput = scn.nextInt();
            if (userInput > maxNum && userInput >= 0){
                maxNum = userInput;
            }
            if (minNum > userInput && userInput >= 0){
                minNum = userInput;
            }
        }

        int range = maxNum - minNum;
        System.out.println("Highest number entered: " + maxNum);
        System.out.println("Lowest number entered: " + minNum);
        System.out.println("Range (max - min): " + range);
        scn.close();
    }
}