package Lab3;
import java.util.Scanner;

public class ChangeMaker {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        double amount;
        double moneyTotal;
        int changeDollar; //1 dollar
        int changeQuarters; //25 cents
        int changeDimes; //10 cents
        int changeNickels; //5 cents
        int changePennies; //1 cent

        System.out.print("Enter in an amount of money less than $10 and more than $0: ");
        moneyTotal = scn.nextDouble();
        amount = moneyTotal;

        if(amount >= 10 || amount < 0){
            System.out.println("The number you entered is not within the accepted range. 10 > input > 0.");
        }else{
            changeDollar = (int)amount / 1;
            amount = amount - changeDollar * 1;
            changeQuarters = (int)(amount / 0.25);
            amount = amount - changeQuarters * 0.25;
            changeDimes = (int)(amount / 0.10);
            amount = amount - changeDimes * 0.10;
            changeNickels = (int)(amount / 0.05);
            amount = amount - changeNickels * 0.05;
            changePennies = (int)(amount / 0.01);
            changePennies++;
            System.out.println("Your change is: ");
            if(changeDollar > 0){
                if(changeDollar > 1){
                    System.out.println(changeDollar + " dollars");
                }else{System.out.println(changeDollar + " dollar");}
            }
            if(changeQuarters > 0){
                if(changeQuarters > 1){
                    System.out.println(changeQuarters + " quarters");
                }else{
                    System.out.println(changeQuarters + " quarter");} 
            }
            if(changeDimes > 0){System.out.println(changeDimes + " dimes");}
            if(changeNickels > 0){System.out.println(changeNickels + " nickels");}
            if(changePennies > 0){System.out.println(changePennies + " pennies");}
        }
        scn.close();
    }
}