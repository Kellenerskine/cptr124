package Lab5;
import java.util.Scanner;
import java.lang.*;

public class GpaCalc {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        char letterGrade = 'A';

        Double A = 4.0;
        Double B = 3.0;
        Double C = 2.0;
        Double D = 1.0;
        Double F = 0.0;

        

        int count = 1;
        while (letterGrade != 'Z' || letterGrade != 'z'){
            
            System.out.println("Input a letter grade as a capital letter. ie. A,B,C,D,F. Type Z to exit and get results.");
            letterGrade = scn.next().charAt(0);
            char letter = Character.toUpperCase(letterGrade);
            String letterAsString = String.valueOf(letter);

            if (letterAsString != "A" || letterAsString != "B" || letterAsString != "C" || letterAsString != "D" || letterAsString != "F"){}
            

            
            System.out.println(letter);
            System.out.println(count);
            count++;
        }
    }
}
