package Lab8;
/**
 * A geometric point is considered a "primitive" type, so the {@code x} and
 * {@code y} fields are public.
 */
public class Point {
    /** The <em>x</em> coordinate of the point object */
    public double x;

    /** The <em>y</em> coordinate of the point object */
    public double y;

    /**
     * Make a point from (x, y) coordinates
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Computes the distance between this point and another point.
     * 
     * @param other the other point to measure the distance to
     * @return the distance between this point and another point
     */
    public double distance(Point other) {
        double xParenth = ((other.x - x) * (other.x - x));
		double yParenth = ((other.y - y) * (other.y - y));
		double toSqRoot = xParenth + yParenth;
		double result = Math.sqrt(toSqRoot);
        return result;
    }

    /**
     * Produces a human-readable representation of the point.
     */
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

}