package Paint;

import java.util.ArrayList;

/**
 * The type Triangle.
 */
public class Triangle {

    private ArrayList<Double> sides;

    /**
     * Instantiates a new Triangle.
     *
     * @param side1 the side 1
     * @param side2 the side 2
     * @param side3 the side 3
     */
    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
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
     * Is equilateral boolean.
     *
     * @return the boolean
     */
    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    /**
     * Calculate perimeter double.
     *
     * @return the double
     */
    public double calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * Calculate area double.
     *
     * @return the double
     */
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        double area2 = s;
        for (double side : sides) {
            area2 *= s - side;
        }
        return Math.sqrt(area2);
    }

    /**
     * Draw string.
     *
     * @return the string
     */
    public String draw() {
        return "Triangle:: Area : " + calculateArea() + ", Perimeter : " + calculatePerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Triangle:: Side1 : " + sides.get(0) + ", Side2 : " + sides.get(1) + ", Side3 : " + sides.get(2);
    }
}
