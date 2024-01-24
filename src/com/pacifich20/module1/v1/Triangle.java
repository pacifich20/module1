package com.pacifich20.module1.v1;

public class Triangle extends TwoDShape {
    //variables
    double side1;
    double side2;
    double side3;

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
        super.width = side1;
        super.height = heronsHeight();
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
                h = 2 * a / super.width;
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

        if (super.width <= 0 || super.height <= 0) {
            area = 0; //checks base and height are both above 0 (area n/a if not)
        } else {
            area = 0.5 * super.width * super.height;
        }
        return area;
    }

}


