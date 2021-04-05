package classCode.chapt7;

import java.util.Scanner;

public class TimeInput {

    public static void main(String[] args) {
        System.out.println("Enter to start and stop");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        long startTime = System.currentTimeMillis();
        scan.nextLine();
        long stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTime)/1000.0);
        scan.close();
    }

}