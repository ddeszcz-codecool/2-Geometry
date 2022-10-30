package com.codecool.geometry;


import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.utilities.Display;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Circle circle = new Circle(6);
//        Rectangle rectangle = new Rectangle(1.5, 1.4);
//        Triangle triangle = new Triangle(6,7,8);
//        Square square = new Square(10);
//        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(2);
        RegularPentagon regularPentagon = new RegularPentagon(5);



        ShapeCollection shapeCollection = new ShapeCollection();
//        shapeCollection.addShape(circle, rectangle, triangle, square, equilateralTriangle, regularPentagon);







        boolean isRunning = true;

	    while (isRunning) {
            Display.mainMenu();
            Scanner scanner = new Scanner(System.in);
            String optionChosenByUser = scanner.nextLine();
            int option = Integer.valueOf(optionChosenByUser);


            switch (option) {
                case 1:
                    System.out.println("Please choose shape type: ");
                    Display.shapeTypesMenu();
                    String shapeType = scanner.nextLine();
                    shapeCollection.addShapeBasedOnUserSelection(Integer.valueOf(shapeType));
                    break;
                case 2:
                    shapeCollection.getShapesTable();
                    break;
                case 3:
                    Display.largestShapeByPerimeter(shapeCollection);
                    break;
                case 4:
                    Display.largestShapeByArea(shapeCollection);
                    break;
                case 5:
                    System.out.println("Please choose shape type: Circle, Rectangle, Triangle, Square, EquilateralTriangle, RegularPentagon");
                    String shapeSelected= scanner.nextLine();
                    Display.equationsForAreaAndPerimeter(shapeSelected);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

}
