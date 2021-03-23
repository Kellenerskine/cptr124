package Lab7;

import java.util.Scanner;

public class TestGeometry {

	private static void doDistance(double x1, double y1, double x2, double y2) {
		System.out.print("The distance between (" + x1 + ", " + y1 + ") and ");
		System.out.println("(" + x2 + ", " + y2 + ") is " + Geometry.distance(x1, y1, x2, y2));
	}

	private static void doSlope(double x1, double y1, double x2, double y2) {
		double slope = Geometry.slope(x1, y1, x2, y2);
		String slopeString;
		if (slope == Double.POSITIVE_INFINITY) {
			slopeString = "undefined";
		} else {
			slopeString = Double.toString(slope);
		}
		System.out.print("The slope of the line between (" + x1 + ", " + y1 + ") and ");
		System.out.println("(" + x2 + ", " + y2 + ") is " + slopeString);
	}

	private static void doIntercept(double x1, double y1, double x2, double y2) {
		if (Geometry.slope(x1, y1, x2, y2) == Double.POSITIVE_INFINITY) {
			System.out.print("The x-");
		} else {
			System.out.print("The y-");
		}
		System.out.print("intercept of the line between (" + x1 + ", " + y1 + ") and ");
		System.out.println("(" + x2 + ", " + y2 + ") is " + Geometry.intercept(x1, y1, x2, y2));
	}

	private static void doEquation(double x1, double y1, double x2, double y2) {
		System.out.print("The equation of the line between (" + x1 + ", " + y1 + ") and ");
		System.out.println("(" + x2 + ", " + y2 + ") is "
				+ Geometry.lineToString(Geometry.slope(x1, y1, x2, y2), Geometry.intercept(x1, y1, x2, y2)));
	}
// -1 -1 5 -1
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			double p_x1, p_y1, p_x2, p_y2;

			// Get the points from the user
			System.out.print("Enter the point coordinates x1, y1, x2, y2: ");
			p_x1 = scan.nextDouble();
			p_y1 = scan.nextDouble();
			p_x2 = scan.nextDouble();
			p_y2 = scan.nextDouble();

			// Exercise the geometry methods
			doDistance(p_x1, p_y1, p_x2, p_y2);
			doSlope(p_x1, p_y1, p_x2, p_y2);
			doIntercept(p_x1, p_y1, p_x2, p_y2);
			doEquation(p_x1, p_y1, p_x2, p_y2);
			System.out.println("----------------------");
		} while (true);
//		scan.close();
	}
}