package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    private double sideOne;
    public Square(double sideOne) {
        super(sideOne, sideOne);
        this.sideOne = sideOne;
    }

    @Override
    public String toString() {

        String sideOnePrint = String.format("%.2f", sideOne);
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+", ");
        sb.append("a = ").append(sideOnePrint);

        return sb.toString();
    }
}
