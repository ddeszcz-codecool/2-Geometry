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
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("sideOne=").append(sideOne);
        sb.append(", sideTwo=").append(sideTwo);
        sb.append('}');
        return sb.toString();
    }
}
