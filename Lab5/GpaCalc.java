package Lab5;
import java.util.Scanner;
import java.util.HashMap;

public class GpaCalc {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        char letterGrade = 0;
        Double gradeValueSum = 0.0;
        Double gradeValueNum = 0.0;

        double passing = 0;
        double failing = 0;
        double count = 0;

        System.out.print("Input a letter grade as a capital letter. ie. A,B,C,D,F. Type Z to finish and get results. ");

        while (letterGrade != 'Z' && letterGrade != 'z'){
            letterGrade = scn.next().charAt(0);
            char letter = Character.toUpperCase(letterGrade);

            HashMap<Character, Double> gradeValue = new HashMap<Character, Double>();
            gradeValue.put('A', 4.0);
            gradeValue.put('B', 3.0);
            gradeValue.put('C', 2.0);
            gradeValue.put('D', 1.0);
            gradeValue.put('F', 0.0);
            
            if (letterGrade == 'Z' || letterGrade == 'z') {break;}

            gradeValueNum = gradeValue.get(letter);
            gradeValueSum = (gradeValueSum + gradeValueNum);
            if (gradeValueNum >= 1.0){passing++;}
            if (gradeValueNum < 1.0){failing++;}
            count++;
        }

        Double result = (gradeValueSum / count);
        System.out.println(" ");
        System.out.println("Results: ");
        System.out.printf("Students passing: " + (int) passing + " (" + "%.3f" + "%%)" , ((passing / count) * 100));
        System.out.println();
        System.out.printf("Students failing: " + (int) failing + " (" + "%.3f" + "%%)" , ((failing / count) * 100));
        System.out.println();
        System.out.printf("Class GPA: " + "%.3f" , result);
        System.out.println();
        scn.close();
    }
}
