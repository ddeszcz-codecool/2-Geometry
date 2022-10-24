package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private double sideOne;
    public EquilateralTriangle(double sideOne) {
        super(sideOne, sideOne, sideOne);
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
