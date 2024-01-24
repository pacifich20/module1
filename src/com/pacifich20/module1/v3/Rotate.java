package com.pacifich20.module1.v3;
/**
 * interface to rotate shapes for shapes that can be rotated
 */
public interface Rotate {
    /**
     * rotates shape 90 degrees
     */
    void rotate90();
    /**
     * rotates shape 180 degrees
     */
    void rotate180();
    /**
     * rotates shape by specified # of degrees
     * @param degree number of degrees shape will be rotated by
     */
    void rotate(double degree);
}

