package classCode.chapt7.rationalNumbers2;

import java.util.Scanner;

public class AddFractions {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Rational frac1, frac2;
		
		frac1 = new Rational(1, 4);
		System.out.println("The numerator of " + frac1 + " is " 
				           + frac1.getNumerator());
		
		frac2 = new Rational(2,3);
		System.out.println(frac2);
		
		System.out.println("-----------------------");
		
		Rational frac3 = new Rational(2, 4);
		System.out.println("frac3 = " + frac3);
		System.out.println(frac3 + " reduces to " + frac3.reduce());
		
		System.out.print("Please enter the fractions: ");
		Rational fraction1, fraction2;
		
		// Grab the first fraction
		String f1 = scan.next();
		fraction1 = Rational.parseRational(f1);
		System.out.println("fraction1 = " + fraction1);

		// Grab the second fraction
		fraction2 = Rational.parseRational(scan.next());
		System.out.println("fraction2 = " + fraction2);

		// Compute the answer
		Rational sum = fraction1.add(fraction2);
		
		// Print the result
		System.out.printf("%s + %s = %s%n", fraction1, 
				          fraction2, sum);
		System.out.printf("%s * %s = %s%n", fraction1, 
				          fraction2, 
				          fraction1.multiply(fraction2));
		
		System.out.println("0/1 = " + Rational.ZERO);
		System.out.println("1/1 = " + Rational.ONE);
		System.out.printf("%s + %s = %s%n",
		                  fraction1, Rational.ONE,
		                  fraction1.add(Rational.ONE));
	}

}