package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private double side;

    public RegularPentagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {


        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return side *5;
    }

    @Override
    public String toString() {
        String sideOnePrint = String.format("%.2f", side);
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+", ");
        sb.append("a = ").append(sideOnePrint);
        return sb.toString();
    }
}
