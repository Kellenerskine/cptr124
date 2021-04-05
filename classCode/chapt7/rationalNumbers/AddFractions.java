package classCode.chapt7.rationalNumbers;

import java.util.Scanner;

public class AddFractions {

	private static final Scanner scan = new Scanner(System.in);
	
//	// This works only for non-negative integers
//	private static int gcd(int m, int n) {
//		// This is NOT an ideal implementation
//		int smaller = (m < n) ? m : n;
//		int factor = 1;
//		for (int i = 2; i <= smaller; i++) {
//			if (m % i == 0 && n % i == 0) {
//				factor = i;
//			}
//		}
//		return factor;
//	}
//	
//	private static String[] getNumbers() {
//		String input = scan.next();
//		String[] parts = input.split("/");
//		return parts;
//	}

	public static void main(String[] args) {
		Rational frac1, frac2;
		
		frac1 = new Rational(1, 0);
		System.out.println("The numerator of " + frac1 + " is " 
				           + frac1.getNumerator());
		
		frac2 = new Rational(2,3);
		System.out.println(frac2);
		
		
		
		
//		System.out.print("Please enter the fractions to add: ");
//		int numerator1, denominator1, numerator2, denominator2;
//		// Grab the first fraction
//		String[] parts = getNumbers();
//		numerator1 = Integer.parseInt(parts[0]);
//		denominator1 = Integer.parseInt(parts[1]);
//	
//		
//		// Grab the second fraction
//		parts = getNumbers();
//		numerator2 = Integer.parseInt(parts[0]);
//		denominator2 = Integer.parseInt(parts[1]);
//
//		// Compute the answer
//		int numeratorSum, denominatorSum;
//		
//		numeratorSum = numerator1*denominator2 + numerator2*denominator1;
//		denominatorSum = denominator1*denominator2;
//		
//		int commonFactor = gcd(numeratorSum, denominatorSum);
//		
//		// Print the result
//		System.out.printf("%d/%d + %d/%d = %d/%d%n",
//				          numerator1, denominator1,
//				          numerator2, denominator2,
//				          numeratorSum/commonFactor, 
//				          denominatorSum/commonFactor);
	}

}