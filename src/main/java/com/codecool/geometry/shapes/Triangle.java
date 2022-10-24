package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    /**
     *     Heron's formula used to calculate the area of a triangle using only triangle sides
     */
    public double calculateArea() {
        return 0.25*Math.sqrt
                (
                (4*Math.pow(sideOne,2)*Math.pow(sideTwo,2))
                        -Math.pow((Math.pow(sideOne,2)+Math.pow(sideTwo,2)-Math.pow(sideThree,2)),2)
                );
    }

    @Override
    public double calculatePerimeter() {
        return sideOne+sideTwo+sideThree;
    }

    @Override
    public String toString() {

        String sideOnePrint = String.format("%.2f", sideOne);
        String sideTwoPrint = String.format("%.2f", sideTwo);
        String sideThreePrint = String.format("%.2f", sideThree);
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+", ");
        sb.append("a = ").append(sideOnePrint).append(", ");
        sb.append("b = ").append(sideTwoPrint).append(", ");
        sb.append("c = ").append(sideThreePrint);

        return sb.toString();
    }
}
