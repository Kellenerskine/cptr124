package Lab8;
/**
 * Represents a geometric line object. All non-vertical lines have a slope and
 * <em>y</em>-axis intercept. All vertical lines have an infinite slope and
 * <em>x</em>-axis intercept. {@code Line} objects are immutable.
 */
public class Line {

    /*
     * ####################################################### 
     * IMPORTANT NOTE!
     * Add your instance variables here to maintain the the 
     * state of a line object. 
     * Line objects are immutable, so your instance variables 
     * should be declared private to render them inaccessible 
     * to clients.
     * #######################################################
     */

    private double m;
    private double b;

    private Point p1;
    private Point p2;
    /**
     * Test to see if two double-precision floating-point values are "equal." The
     * values are considered equal when their difference is small.
     * 
     * @param a         one of the values
     * @param b         the other value
     * @param tolerance the small difference
     * @return True, if the two values are close enough to be considered equal;
     *         otherwise, false
     */
    private static boolean equals(double a, double b, double tolerance) {
        return a == b || Math.abs(a - b) < tolerance;
    }

    /**
     * Makes a line object with a given slope and intercept
     * 
     * @param m the slope of the new line {@code Double.POSITIVE_INFINITY} for a
     *          vertical line
     * @param b the y-axis intercept for a non-vertical line; the
     *          x-axis intercept for a vertical line
     */
    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    /**
     * Makes a line object that passes throught the given point objects.
     * 
     * @param p1 one of the points on the line
     * @param p2 the other point on the line
     * @throws IllegalArgumentException if the two points are the same
     * @see Point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        if (p1 == p2){
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the slope of the line
     * 
     * @return the slope of the line, {@code Double.POSITIVE_INFINITY} if the line
     *         is vertical
     */
    public double slope() {
        double slope2 = ((p2.y - p1.y) / (p2.x - p1.x));
        return slope2;
    }

    /**
     * Returns the line's intercept:
     * <ul>
     * <li><em>y</em>-axis intercept if the line is non-vertical
     * <li><em>x</em>-axis intercept if the line is vertical
     * </ul>
     * 
     * @return the intercept of the line, <em>x</em>-axis intercept if the line is
     *         vertical
     */
    public double intercept() {
        double slope = slope();
        double inter = 0.0;
        if (p1.x == p2.x){
            inter = p1.x;
        }else if(p1.y == p2.y){
            inter = p1.y;
        }else {
            inter = (p1.y - (slope * p1.x));
        }
        return inter;
    }

    /**
     * Computes the point of intersection between this line and another line object.
     * 
     * @param other the other line object
     * @return the point of intersectionm between this line ans the other line.
     *         Returns {@code null} if the lines do not intersect
     * @see Point
     */
    public Point intersection(Line other) {
        //x = (b2 - b1)/(m1 - m2)
        double x = 0;
        double y = 0;

        x = ((other.b - b) / (other.m - m));
        y = ((this.m * (x)) + this.b);

        return new Point(x, y);
    }

    /**
     * Provides a human-readable string representation of the line; for example, y =
     * mx + b form for non-vertical line and x = b for a vertical line.
     */
    @Override
    public String toString() {
        // Replace with your code
        return "LINE EQUATION";
    }
}