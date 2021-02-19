package Lab5;
import java.util.Scanner;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;

public class GpaCalc {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        char letterGrade = 0;
        
        Double gradeValueSum = 0.0;
        
        System.out.println(gradeValueSum);

        int count = 1;
        while (letterGrade != 'Z' && letterGrade != 'z'){
            Double gradeValueNum = gradeValue.get(letterGrade);
            gradeValueSum = (gradeValueSum + gradeValueNum);
            HashMap<Character, Double> gradeValue = new HashMap<Character, Double>();
            gradeValue.put('A', 4.0);
            gradeValue.put('B', 3.0);
            gradeValue.put('C', 2.0);
            gradeValue.put('D', 1.0);
            gradeValue.put('F', 0.0);
            System.out.println("Input a letter grade as a capital letter. ie. A,B,C,D,F. Type Z to finish and get results.");
            char letter = Character.toUpperCase(letterGrade);
            letterGrade = scn.next().charAt(0);
            
            System.out.println(letter);
            count++;
        }
        Double result = (gradeValueSum / count);
        System.out.println(result);
    }
}
