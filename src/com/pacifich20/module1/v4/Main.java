package com.pacifich20.module1.v4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(9, 7, 5, Color.RED));
        shapes.add(new Circle(9, Color.BLUE));
        shapes.add(new Triangle(120, 200, 120, Color.NONE));
        shapes.add(new Circle(53, Color.GREEN));

        for (TwoDShape shape:shapes) {
            System.out.println(shape);
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.getArea());
        }
    }
}
