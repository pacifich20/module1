package com.pacifich20.module1.v4;

public class Circle extends TwoDShape {
    //variables
    public final double PI = Math.PI;
    private final double radius;

    /**
     * creates circle using given radius and color
     * @param radius radius of circle
     * @param color color of circle
     */
    public Circle(double radius, Color color) {
        // radius half of width and height (diameter)
        super(2 * radius, 2 * radius, color);
        this.radius = radius;
    }

    /**
     * obtains area of circle using formula area = π × r²
     * @return area of the circle
     */
    @Override
    public double getArea() {
        double area;

        if (radius <= 0.0) {
            area =  0; //checks that radius is above 0 (area n/a if not)
        } else {
            area = PI * Math.pow(radius, 2);
        }
        return area;
    }

    /**
     * converts circle information to string format for printing
     * @return circle information in string format
     */
    @Override
    public String toString() {
        return "Circle " + "width = " + super.getWidth() + ", height = " + super.getHeight() + ", π = " + PI + ", radius = " + radius + ", color = " + super.getColor();
    }
}