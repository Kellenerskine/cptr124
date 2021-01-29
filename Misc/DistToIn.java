package Misc;
import java.util.Scanner;

public class DistToIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, feet, inches, totalInches;
        System.out.println("This is a program that will give you the distance you enter in inches :)");
        System.out.print("Please enter miles, feet, and inches: ");
        miles = input.nextInt();
        feet = input.nextInt();
        inches = input.nextInt();

        final int inchesPerFoot = 12;
        final int feetPerMile = 5280;
        final int inchesPerMile = inchesPerFoot * feetPerMile;

        totalInches = miles * inchesPerMile + feet * inchesPerFoot + inches;

        System.out.println(miles + " mi " + feet + "ft" + inches + "in = " + totalInches + "in");

        input.close();
    }
}