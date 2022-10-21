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

        RegularPentagon regularPentagon = new RegularPentagon(2);

        System.out.println(regularPentagon.calculateArea());
        System.out.println(regularPentagon.calculatePerimeter());
        System.out.println(regularPentagon);



        EquilateralTriangle EquilateralTriangle = new EquilateralTriangle(2);

        System.out.println(EquilateralTriangle.calculateArea());
        System.out.println(EquilateralTriangle.calculatePerimeter());
        System.out.println(EquilateralTriangle);


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
