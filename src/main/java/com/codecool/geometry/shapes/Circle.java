package com.codecool.geometry.shapes;

public class Circle extends Shape {


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        String radiusPrint = String.format("%.2f", radius);
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+", ");
        sb.append("r = ").append(radiusPrint);

        return sb.toString();
    }
}
