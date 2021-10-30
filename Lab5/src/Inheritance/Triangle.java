package Inheritance;

/**
 * The type Triangle.
 */
public class Triangle extends Polygon {

    /**
     * Instantiates a new Triangle.
     *
     * @param sides the sides
     */
    public Triangle(double... sides) {
        super(sides);
    }

    /**
     * Is equilateral boolean.
     *
     * @return the boolean
     */
    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        double area2 = s;
        for (double side : sides) {
            area2 *= s - side;
        }
        return Math.sqrt(area2);
    }

    @Override
    public String draw() {
        return "Triangle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Triangle:: " + super.toString();
    }
}
