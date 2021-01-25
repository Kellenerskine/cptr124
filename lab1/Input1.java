package lab1;

import java.util.Scanner;

public class Input1 {
    public static void main(String [] args) {
        int num1;
        int num2;

        Scanner scnr = new Scanner(System.in);

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }
}