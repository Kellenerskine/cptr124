package Lab3;
import java.util.Scanner;

public class ChangeMaker {
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);
        float moneyTotal;
        moneyTotal = scn.nextFloat();
        System.out.println("Enter some stoof: ");
        
        int centVal = (int) (moneyTotal * 100);
        int dollars = (centVal / 100);
        int quarters = ((centVal % 100) / 25);
        int dimes = ((centVal % 100 % 25) / 10);
        int nickels = ((centVal % 100 % 25 % 10) / 5);
        int pennies = ((centVal % 100 % 25 % 10 % 5) % 5);

        if(moneyTotal >= 10 || moneyTotal <= 0){
            System.out.println("The number you entered is not within the accepted range. 10 > input > 0.");
        }else{
            System.out.println("Your change is: ");
            if(dollars > 0){
                if(dollars > 1){
                    System.out.println(dollars + " dollars");
                }else{System.out.println(dollars + " dollar");}
            }
            if(quarters > 0){
                if(quarters > 1){
                    System.out.println(quarters + " quarters");
                }else{
                    System.out.println(quarters + " quarter");
                }
            }
            if(dimes > 0){
                if (dimes > 1){
                    System.out.println(dimes + " dime");
                }else{
                    System.out.println(dimes + " dimes");
                }
            }
            if(nickels > 0){
                if(nickels > 1){
                    System.out.println(nickels + " nickel");
                }else{
                    System.out.println(nickels + " nickels");
                }
            }
            if(pennies > 0){
                if(pennies > 1){
                    System.out.println(pennies + " penny");
                }else{
                    System.out.println(pennies + " pennies");
                }
            }
        }
        scn.close();
    }
}