package com.codecool.geometry.shapes;


/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    /**
     * Calculates shape's area.
     *
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     *
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Check if all args are greater than 0
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     *
     * @param args
     * @return true if all of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) throws IllegalArgumentException {
        for (float argument :args) {
            if (argument<=0)
                throw new IllegalArgumentException("One of the arguments is 0 or less");
                return false;
        }
        return true;
    }
}
