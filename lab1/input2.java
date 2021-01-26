package lab1;

import java.util.Scanner;

public class input2 {
    public static void main(String [] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter two numbers separated by spaces (the numbers must be between -1000 and 1000): ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Product: " + num1 + " x " + num2 + " = " + (num1 * num2));
    sc.close();
    }
}