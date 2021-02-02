package Lab2;
import java.util.Scanner;

public class ExcerComp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int beanBurrito;
        int salad;
        int milkshake;
        int bbCal = 357;
        int salCal = 185;
        int milkCal = 388;

        System.out.print("How many bean burritos, bowls of salad, and milkshakes did you consume? ");
        beanBurrito = scn.nextInt();
        salad = scn.nextInt();
        milkshake = scn.nextInt();
        int totalCal = ((salad * salCal) + (beanBurrito * bbCal) + (milkshake * milkCal));

        double milesToExcer = totalCal / 100.0;

        System.out.println("You have eaten a total of " + totalCal + " calories");
        System.out.println("You need to run or walk " + milesToExcer + " miles to burn the calories off.");
        scn.close();
    }
    
}
