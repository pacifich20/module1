package com.pacifich20.module1.v1;

/**
 * parent class for two-dimensional shapes
 */
public class TwoDShape {
    //variables
    double width;
    double height;

    /**
     * creates 2d shape using given width and height
     * @param width width of shape
     * @param height height of shape
     */
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * creates 2d shape
     */
    public TwoDShape() {
    }

    /**
     * calculates area of shape based on area formula for shape
     * @return area of shape
     */
    public double getArea() {
        return width * height;
    }

    /**
     * sets height of shape
     * @param height height of shape
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
