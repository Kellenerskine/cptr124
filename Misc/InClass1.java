package Misc;

import java.util.Scanner;

public class InClass1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = 5, n2 = 10, n3 = 0, n4 = 0;

        System.out.printf("n1 = %d n3 = %d%n", n1, n3);
        n3 = n1++;
        System.out.printf("n1 = %d n3 = %d%n", n1, n3);
        int randomInput = scn.nextInt();
        System.out.println(randomInput, n2);

        scn.close();

    }
}
/*
 * comments on the first test as well as notes on the class itself:
 * 
 */