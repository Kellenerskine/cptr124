package lab1;

import java.util.Scanner;

public class Input1 {
    public static void main(String [] args) {
        int num1;
        int num2;
        int x = -1001;
        int y = 1001;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter two numbers separated by spaces (the numbers must be between -1000 and 1000): ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 < y && num1 > x && num2 < y && num2 > x/* && num1 != null && num2 != m*/){
            System.out.println("Sum: " + num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println("Difference: " + num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println("Product: " + num1 + " x " + num2 + " = " + (num1 * num2));
        }else{
            System.out.print("One or more of the numbers you entered were not within the required parameters. Please try again.");
        }
        sc.close();
    }
}