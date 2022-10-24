package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double calculateArea() {
        return sideOne*sideTwo;
    }

    @Override
    public double calculatePerimeter() {
        return (sideOne*2)+(sideTwo*2);
    }

    @Override
    public String toString() {
        String sideOnePrint = String.format("%.2f", sideOne);
        String sideTwoPrint = String.format("%.2f", sideTwo);
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+", ");
        sb.append("a = ").append(sideOnePrint).append(", ");
        sb.append("b = ").append(sideTwoPrint);

        return sb.toString();
    }
}
