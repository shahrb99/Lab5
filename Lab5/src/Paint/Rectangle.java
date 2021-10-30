package Paint;

import java.util.ArrayList;

/**
 * The type Rectangle.
 */
public class Rectangle {

    private ArrayList<Double> sides;

    /**
     * Instantiates a new Rectangle.
     *
     * @param length the length
     * @param width  the width
     */
    public Rectangle(double length, double width) {
        sides = new ArrayList<>();
        sides.add(length);
        sides.add(width);
    }

    /**
     * Gets sides.
     *
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * Is square boolean.
     *
     * @return the boolean
     */
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
    }

    /**
     * Calculate perimeter double.
     *
     * @return the double
     */
    public double calculatePerimeter() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    /**
     * Calculate area double.
     *
     * @return the double
     */
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    /**
     * Draw string.
     *
     * @return the string
     */
    public String draw() {
        return "Rectangle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Rectangle:: Length : " + sides.get(0) + "Width : " + sides.get(1);
    }
}
