package com.pacifich20.module1.v2;

/**
 * parent class for two-dimensional shapes
 */
public abstract class TwoDShape {
    //variables
    private double width;
    private double height;

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

    //getters and setters
    /**
     * gets width of shape
     * @return width of shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * sets width of shape
     * @param width width of shape
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * gets height of shape
     * @return height of shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * sets height of shape
     * @param height height of shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * calculates area of shape based on area formula for shape
     * @return area of shape
     */
    public abstract double getArea();

}