package Paint;

import java.util.ArrayList;

/**
 * The type Paint.
 */
public class Paint {

    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    /**
     * Instantiates a new Paint.
     */
    public Paint() {
        triangles = new ArrayList<>();
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Add triangle.
     *
     * @param triangle the triangle
     */
    public void addTriangle(Triangle triangle) {
        if (!triangles.contains(triangle)) {
            triangles.add(triangle);
        }
    }

    /**
     * Add circle.
     *
     * @param circle the circle
     */
    public void addCircle(Circle circle) {
        if (!circles.contains(circle)) {
            circles.add(circle);
        }
    }

    /**
     * Add rectangle.
     *
     * @param rectangle the rectangle
     */
    public void addRectangle(Rectangle rectangle) {
        if (!rectangles.contains(rectangle)) {
            rectangles.add(rectangle);
        }
    }

    /**
     * Draw all.
     */
    public void drawAll() {
        for (Triangle triangle : triangles) {
            System.out.println(triangle.draw());
        }
        for (Circle circle : circles) {
            System.out.println(circle.draw());
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.draw());
        }
    }

    /**
     * Print all.
     */
    public void printAll() {
        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
    }
}
