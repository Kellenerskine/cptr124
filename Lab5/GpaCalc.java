package Lab5;
import java.util.Scanner;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;

public class GpaCalc {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        char letterGrade = scn.next().charAt(0);

        HashMap<String, Double> gradeValue = new HashMap<String, Double>();
        gradeValue.put("A", 4.0);
        gradeValue.put("B", 3.0);
        gradeValue.put("C", 2.0);
        gradeValue.put("D", 1.0);
        gradeValue.put("F", 0.0);
        Double gradeValueA = gradeValue.get("A");
        Double gradeValueB = gradeValue.get("B");
        Double gradeValueC = gradeValue.get("C");
        Double gradeValueD = gradeValue.get("D");
        Double gradeValueF = gradeValue.get("F");
        
        Double gradeValueSum = (gradeValueA + gradeValueB + gradeValueC + gradeValueD + gradeValueF);
        
        System.out.println(gradeValueSum); 

        int count = 1;
        while (letterGrade != 'Z' || letterGrade != 'z'){
            //char letterGrade;
            System.out.println("Input a letter grade as a capital letter. ie. A,B,C,D,F. Type Z to finish and get results.");
            letterGrade = scn.next().charAt(0);
            char letter = Character.toUpperCase(letterGrade);
            String letterAsString = String.valueOf(letter);

            if (letterAsString != "A" && letterAsString != "B" && letterAsString != "C" && letterAsString != "D" && letterAsString != "F"){}
            

            
            System.out.println(letter);
            System.out.println(count);
            count++;
        }
        Double result = (gradeValueSum / count);
        System.out.println(result);
    }
}
