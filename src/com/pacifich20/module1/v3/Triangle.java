package com.pacifich20.module1.v3;

import com.pacifich20.module1.v4.Color;

public class Triangle extends TwoDShape implements Rotate {
    //variables
    double side1;
    double side2;
    double side3;
    private double angle = 0;

    /**
     * creates triangle using given width and height
     * @param width width of triangle
     * @param height height of triangle
     */
    public Triangle(double width, double height) {
        super(width, height);
    }

    /**
     * creates triangle using given side 1 length, side 2 length, side 3 length and colo
     * @param side1 length of triangle side 1
     * @param side2 length of triangle side 2
     * @param side3 length of triangle side 3
     */
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        //sets width and height to base defined by side1 and height defined by herons formula
        super.setWidth(side1);
        super.setHeight(heronsHeight());
    }

    /**
     * obtains height of triangle using heron's height formula provided here: https://www.youtube.com/watch?v=a1PR9O1Va84
     * @return height of triangle
     */
    private double heronsHeight() {
        double h;
        double a;
        double s;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            h = 0; //checks that all sides of triangle are above length of 0 (height n/a if not)
        } else {
            //obtain area using heron's height formula https://www.youtube.com/watch?v=a1PR9O1Va84
            s = (side1 + side2 + side3) / 2;
            a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            if (a <= 0 || Double.isNaN(a)) {
                h = 0; //checks that obtained triangle area is above 0 (height n/a if not)
            } else {
                h = 2 * a / super.getWidth();
            }
        }
        return h;
    }

    /** obtains area of triangle using formula area = 1/2 × b × h
     *
     * @return area of triangle
     */
    @Override
    public double getArea() {
        double area;

        if (super.getWidth() <= 0 || super.getHeight() <= 0) {
            area = 0; //checks base and height are both above 0 (area n/a if not)
        } else {
            area = 0.5 * super.getWidth() * super.getHeight();
        }
        return area;
    }

    /**
     * converts triangle information to string format for printing
     * @return triangle information in string format
     */
    @Override
    public String toString() {
        return "Triangle side length 1 = " + side1 + ", side length 2 = " + side2 + ", side length 3 = " + side3 + ", width = " + super.getWidth() + ", height = " + super.getHeight() + ", angle = " + angle;
    }

    /**
     * rotates triangle 90 degrees
     */
    @Override
    public void rotate90() {
        rotate(90);
    }

    /**
     * rotates triangle 180 degrees
     */
    @Override
    public void rotate180() {
        rotate(180);
    }

    /**
     * rotates triangle by specified # of degrees
     * @param degree number of degrees triangle will be rotated by
     */
    @Override
    public void rotate(double degree) {
        angle += degree;
        angle %= 360;
    }

}


