package com.pacifich20.module1.v4;

/**
 * parent class for two-dimensional shapes
 */
public abstract class TwoDShape {
    //variables
    private double width;
    private double height;
    private Color color;

    /**
     * creates 2d shape using given width, height, and color
     * @param width width of shape
     * @param height height of shape
     * @param color color of shape
     */
    public TwoDShape(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     * creates 2d shape using given color
     * @param color color of shape
     */
    public TwoDShape(Color color) {
        this.color = color;
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
     * gets color of shape
     * @return color of shape
     */
    public Color getColor() {
        return color;
    }

    /**
     * sets color of shape
     * @param color color of shape
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * calculates area of shape based on area formula for shape
     * @return area of shape
     */
    public abstract double getArea();

}