package Inheritance;

/**
 * The type Circle.
 */
public class Circle extends Shape {

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
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
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

    @Override
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public String draw() {
        return "Circle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Circle:: Radius : " + radius;
    }
}
