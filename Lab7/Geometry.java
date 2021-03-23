package Lab7;

public class Geometry {
	
	//  Test to see if two double-precision floating-point
	//  values are "equal."  The values are considered 
	//  equal when their difference is small.
	public static boolean floatEquals(double a, double b) {
		double thresh = a-b;
		if (Math.abs(thresh) <= 0.001){
			return true;
		}else {
			return false;
		}
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		
		double xParenth = ((x2 - x1) * (x2 - x1));
		double yParenth = ((y2 - y1) * (y2 - y1));
		double toSqRoot = xParenth + yParenth;
		double result = Math.sqrt(toSqRoot);
		return result;
	}

	public static double slope(double x1, double y1, double x2, double y2) {
		if ((floatEquals(x1, x2) && floatEquals(y1, y2))){
			throw new IllegalArgumentException();
		}
		if(floatEquals(x1, x2)) {
			return Double.POSITIVE_INFINITY;
		}
		return ((y2 - y1) / (x2 - x1));
	}

	public static double intercept(double x1, double y1, double x2, double y2) {
		if (floatEquals(x1, x2) && floatEquals(y1, y2)){
			throw new IllegalArgumentException();
		}
		if (floatEquals(x1, x2)){
			return x1;
		}
		double b = (y1 - (slope(x1, y1, x2, y2) * x1));
		return b;
	}

	public static String lineToString(double m, double b) {
		String yeq = "y = ";
		String slope = "";
		String inter = "";
		slope = String.format("%.2f", m) + String.format("x + ");
		inter = String.format("%.2f", b);
		String finProd = (yeq + slope + inter);
		return finProd;

		//String s = String.format("y = " + (m * x1) + b);
	}

	public static String lineToString(double x1, double y1, double x2, double y2) {
		return lineToString(slope(x1, y1, x2, y2), intercept(x1, y1, x2, y2));
	}
}