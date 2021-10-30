package Inheritance;

import java.util.ArrayList;

/**
 * The type Paint.
 */
public class Paint {

    private ArrayList<Shape> shapes;

    /**
     * Instantiates a new Paint.
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * Add shape.
     *
     * @param shape the shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Draw all.
     */
    public void drawAll() {
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }

    /**
     * Print all.
     */
    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * Describe equal sides.
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare()) {
                    System.out.println(shape.toString());
                }
            } if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral()) {
                    System.out.println(shape.toString());
                }
            }
        }
    }
}
