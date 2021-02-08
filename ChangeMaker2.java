import java.util.*;


public class ChangeMaker2 {

	public static void main(String[] args) {
		//Create the scanner object
		Scanner scan = new Scanner(System.in);
		
		//Declare variables (amount, twenties, tens, ...nickels)
		double amount = 999.99;
		double testamount;
		int twenty, ten, five, toonie, loonie, quarter, dime, nickel;
	//do 
		do{

			//get amount from user
		 testamount = scan.nextDouble();
		amount = testamount;
			//Use integer division to find out how many twenties goes into the amount
			twenty = (int)amount/20;
			
		//subtract twenties * 20 from total
			amount = amount - twenty*20;//amount -= twenty*20; 
			
		//Repeat similar process for smaller denominations until done
			ten =  (int)amount/10;
			amount -= ten*10;
			five =  (int)amount/5;
			amount -= five*5;
			quarter =  (int)(amount/0.25);
			amount -= quarter*0.25;
			dime = (int)(amount / 0.10);
			amount -= dime*0.1;
			nickel = (int)Math.round(amount / 0.05);
			amount -= nickel*0.05;
			
		//report the values of each denomination to the user
			System.out.println("Your change is "+twenty+ " twenties, " + 
								ten + " tens, " + five + " fives, " + quarter + 
								" quarters, " + dime + "dimes, " + nickel + "nickels." );
			
			//while amount > 0	
		}while (testamount > 0);


	//close scanner object
		scan.close();

	}

}
