package Paint;

/**
 * The type Circle.
 */
public class Circle {

    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
    public Circle(double radius) {
        setRadius(radius);
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate perimeter double.
     *
     * @return the double
     */
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }

    /**
     * Calculate area double.
     *
     * @return the double
     */
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    /**
     * Draw string.
     *
     * @return the string
     */
    public String draw() {
        return "Circle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Circle:: Radius : " + radius;
    }
}
