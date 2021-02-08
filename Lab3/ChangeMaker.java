package Lab3;
import java.util.Scanner;

public class ChangeMaker {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        double moneyTotal; //less than $10
        int changeDollar; //1 dollar
        int changeQuarters; //25 cents
        int changeDimes; //10 cents
        int changeNickels; //5 cents
        int changePennies; //1 cent

        System.out.print("Enter in an amount of money less than $10 and more than $0: ");
        moneyTotal = scn.nextDouble();

        if(moneyTotal >= 10){
            System.out.println("The number you entered is higher than $10. Please enter a number less than 10.");
        }

        changeDollar = (int)moneyTotal / 1;
        changeQuarters = (int)moneyTotal / 0.25;


        scn.close();
    }
}