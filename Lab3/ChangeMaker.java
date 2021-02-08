package Lab3;
import java.util.Scanner

public class ChangeMaker {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        int moneyTotal; //less than $10
        int changeNickels; //5 cents
        int changeDimes; //10 cents
        int changeQuarters; //25 cents
        int changePennies; //1 cent

        moneyTotal = scn.nextInt();

        if(moneyTotal > 10){
            System.out.println("The number you entered is higher than $10. Please enter a number less than 10.");
        }
        System.out.println("random");
    }
}
