package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;

public class SortShapeComparator {

    public String shapeName;
    public double shapeArea;
    public double shapePerimeter;
    public SortShapeComparator(String shapeName, double shapeArea, double shapePerimeter ) {
        this.shapeName = shapeName;
        this.shapeArea = Math.round(shapeArea*100)/100.0;
        this.shapePerimeter = Math.round(shapePerimeter*100)/100.0;
    }

    public double getShapePerimeter() {
        return shapePerimeter;
    }

    public double getShapeArea() {
        return shapeArea;
    }
}
