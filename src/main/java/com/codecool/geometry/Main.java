package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 5);
        Triangle triangle = new Triangle(6,7,8);
        Square square = new Square(10);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(2);
        RegularPentagon regularPentagon = new RegularPentagon(5);

        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(circle, rectangle, triangle, square, equilateralTriangle, regularPentagon);

        shapeCollection.getShapesTable();

        System.exit(0);

        boolean isRunning = true;

	    while (isRunning) {
	        int option = 0;  // TODO read the keyboard here

            switch (option) {
                case 1:
                    // TODO Add new shape
                    break;
                case 2:
                    // TODO Show all shapes
                    break;
                case 3:
                    // TODO Show shape with the largest perimeter
                    break;
                case 4:
                    // TODO Show shape with the largest area
                    break;
                case 5:
                    // TODO Show formulas
                    break;
                case 0:
                    // TODO Exit
                    break;
            }
        }
    }

}
