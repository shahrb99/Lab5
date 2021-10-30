package Inheritance;

/**
 * The type Rectangle.
 */
public class Rectangle extends Polygon{

    /**
     * Instantiates a new Rectangle.
     *
     * @param sides the sides
     */
    public Rectangle(double... sides) {
        super(sides);
    }

    /**
     * Is square boolean.
     *
     * @return the boolean
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
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
        double area = 1;
        for (double side : sides) {
            area *= side;
        }
        return 0;
    }

    @Override
    public String draw() {
        return "Rectangle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Rectangle:: " + super.toString();
    }
}
