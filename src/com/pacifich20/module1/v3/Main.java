package com.pacifich20.module1.v3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(9, 7, 5));
        shapes.add(new Circle(9));
        shapes.add(new Triangle(120, 200, 120));
        shapes.add(new Circle(53));

        for (TwoDShape shape:shapes) {
            System.out.println(shape);
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.getArea());
        }
    }
}
