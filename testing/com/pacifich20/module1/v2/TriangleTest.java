package com.pacifich20.module1.v2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    /**
     * tests getArea method when base and/or height is positive, negative, zero, max double, and min double
     */
    @Test
    public void testGetAreaBaseHeight() {
        double delta = 0.000000001;

        Triangle allPositiveTriangle = new Triangle(10, 10);
        assertEquals(50.0, allPositiveTriangle.getArea(), delta);

        Triangle allNegativeTriangle = new Triangle(-10, -10);
        assertEquals(0.0, allNegativeTriangle.getArea(), delta);

        Triangle baseNegativeTriangle = new Triangle(-10, 10);
        assertEquals(0.0, baseNegativeTriangle.getArea(), delta);

        Triangle heightNegativeTriangle = new Triangle(10, -10);
        assertEquals(0.0, heightNegativeTriangle.getArea(), delta);

        Triangle allZeroTriangle = new Triangle(0, 0);
        assertEquals(0.0, allZeroTriangle.getArea(), delta);

        Triangle baseZeroTriangle = new Triangle(0, 10);
        assertEquals(0.0, baseZeroTriangle.getArea(), delta);

        Triangle heightZeroTriangle = new Triangle(10, 0);
        assertEquals(0.0, heightZeroTriangle.getArea(), delta);

        Triangle allMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, allMaxDoubleTriangle.getArea(), delta);

        Triangle baseMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, 10);
        assertEquals(Double.POSITIVE_INFINITY, baseMaxDoubleTriangle.getArea(), delta);

        Triangle heightMaxDoubleTriangle = new Triangle(10, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, heightMaxDoubleTriangle.getArea(), delta);

        Triangle allMinDoubleTriangle = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(0.0, allMinDoubleTriangle.getArea(), delta);

        Triangle baseMinDoubleTriangle = new Triangle(Double.MIN_VALUE, 10);
        assertEquals(0.0, baseMinDoubleTriangle.getArea(), delta);

        Triangle heightMinDoubleTriangle = new Triangle(10, Double.MIN_VALUE);
        assertEquals(0.0, heightMinDoubleTriangle.getArea(), delta);
    }

    /**
     * tests getArea method when sides are positive, negative, zero, max double, and min double, or invalid
     */
    @Test
    public void testGetAreaSides() {
        double delta = 0.000000001;

        Triangle allPositiveTriangle = new Triangle(10, 10, 10);
        assertEquals(43.3012701892, allPositiveTriangle.getArea(), delta);

        Triangle allNegativeTriangle = new Triangle(-10, -10, -10);
        assertEquals(0.0, allNegativeTriangle.getArea(), delta);

        Triangle side1NegativeTriangle = new Triangle(-10, 10, 10);
        assertEquals(0.0, side1NegativeTriangle.getArea(), delta);

        Triangle side2NegativeTriangle = new Triangle(10, -10, 10);
        assertEquals(0.0, side2NegativeTriangle.getArea(), delta);

        Triangle side3NegativeTriangle = new Triangle(10, 10, -10);
        assertEquals(0.0, side3NegativeTriangle.getArea(), delta);

        Triangle allZeroTriangle = new Triangle(0, 0, 0);
        assertEquals(0.0, allZeroTriangle.getArea(), delta);

        Triangle side1ZeroTriangle = new Triangle(0, 10, 10);
        assertEquals(0.0, side1ZeroTriangle.getArea(), delta);

        Triangle side2ZeroTriangle = new Triangle(10, 0, 10);
        assertEquals(0.0, side2ZeroTriangle.getArea(), delta);

        Triangle side3ZeroTriangle = new Triangle(10, 10, 0);
        assertEquals(0.0, side3ZeroTriangle.getArea(), delta);

        Triangle allMaxDoubleTriangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, allMaxDoubleTriangle.getArea(), delta);

        Triangle allMinDoubleTriangle = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(0.0, allMinDoubleTriangle.getArea(), delta);

        Triangle invalidTriangle = new Triangle(1, 2, 3);
        assertEquals(0.0, invalidTriangle.getArea(), delta);

        Triangle invalidTriangle2 = new Triangle(1, 2, 4);
        assertEquals(0.0, invalidTriangle2.getArea(), delta);
    }
}