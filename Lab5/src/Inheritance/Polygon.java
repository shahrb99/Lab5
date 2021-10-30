package Inheritance;

import java.util.ArrayList;

/**
 * The type Polygon.
 */
public abstract class Polygon extends Shape {

    /**
     * The Sides.
     */
    protected ArrayList<Double> sides;

    /**
     * Instantiates a new Polygon.
     *
     * @param sides the sides
     */
    public Polygon(double... sides) {
        this.sides = new ArrayList<>();
        for (double side : sides) {
            this.sides.add(side);
        }
    }

    /**
     * Gets sides.
     *
     * @return the sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (double side : sides) {
            result.append("Side").append(sides.indexOf(side)).append(" : ").append(side).append(", ");
        }
        return result.toString();
    }
}
