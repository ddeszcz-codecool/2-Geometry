package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.*;

import java.sql.SQLOutput;
import java.util.*;

public class ShapeCollection {

    private List<Shape> shapesList;

    public ShapeCollection() {
        this.shapesList = new ArrayList<>();
    }


    public void addShape(Shape shape) {
        this.shapesList.add(shape);
    }

    public void addShape(Shape... shapes) {
        for (Shape shape : shapes)
            this.shapesList.add(shape);
    }

    public void addShapeBasedOnUserSelection(int selection){
        Scanner scanner = new Scanner(System.in);

        switch(selection){
            case 1:
                System.out.println("Please provide the radius length in m: ");
                int radius = scanner.nextInt();
                addCircle(radius);
                break;
            case 2:
                System.out.println("Please provide side a length in m: ");
                int sideA = scanner.nextInt();
                System.out.println("Please provide side b length in m: ");
                int sideB = scanner.nextInt();
                addRectangle(sideA, sideB);
                break;
            case 3:
                System.out.println("Please provide side a length in m: ");
                int sideAtr = scanner.nextInt();
                System.out.println("Please provide side b length in m: ");
                int sideBtr = scanner.nextInt();
                System.out.println("Please provide side c length in m: ");
                int sideCtr = scanner.nextInt();
                addTriangle(sideAtr, sideBtr, sideCtr);
                break;
            case 4:
                System.out.println("Please provide side length in m: ");
                int side = scanner.nextInt();
                addSquare(side);
                break;
            case 5:
                System.out.println("Please provide side length in m: ");
                int sideTri = scanner.nextInt();
                addEquilateralTriangle(sideTri);
                break;
            case 6:
                System.out.println("Please provide side length in m: ");
                int sidePen = scanner.nextInt();
                addRegularPentagon(sidePen);
                break;
            default:
                System.out.println("Error occurred when adding new element ");
                break;
            }



        }

    private void addCircle (int radius){
        Circle circle = new Circle(radius);
        addShape(circle);
    }
    
    private void addRectangle (int sideA, int sideB){
        Rectangle rectangle = new Rectangle(sideA, sideB);
        addShape(rectangle);
    }

    private void addTriangle (int sideA, int sideB, int sideC){
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        addShape(triangle);
    }

    private void addSquare (int sideA){
        Square square = new Square(sideA);
        addShape(square);
    }

    private void addEquilateralTriangle (int sideA){
        EquilateralTriangle square = new EquilateralTriangle(sideA);
        addShape(square);
    }

    private void addRegularPentagon (int sideA){
        RegularPentagon square = new RegularPentagon(sideA);
        addShape(square);}
    
    public void getShapesTable() {
        int count = 0;
        int col1length = 3;
        int col2length = 20;
        int col3length = 65;
        int col4length = 10;
        int col5length = 30;
        int numberOfColumns = 6;
        int totalLength = col1length+col2length+col3length+col4length*3+col5length+numberOfColumns;
        String tableTopFrame = "/"+"-".repeat(totalLength)+"\\";
        String tableBottomFrame = "\\"+"-".repeat(totalLength)+"/";
        String headerTableLine = String.format
                ("|%"+col1length+"s|%"+col2length+"s|%"+col3length+"s|%"+col4length+"s"+
                 "|%"+col4length+"s|%"+col4length+"s|%"+col5length+"s|",
                 "ID","Class","toString","Perimeter","Formula","Area", "Formula");
        String spacer =(
                "|"+"-".repeat(col1length)+"|"+"-".repeat(col2length)+"|"+"-".repeat(col3length)+"|"+"-".repeat(col4length)
                        +"|"+"-".repeat(col4length)+"|"+"-".repeat(col4length)+"|"+"-".repeat(col5length)+"|");



        System.out.println(tableTopFrame);
        System.out.println(headerTableLine);
        for (Shape shape:this.shapesList) {
            System.out.println(spacer);

            String singleTableLine = String.format(
                   "|%"+col1length+"d|%"+col2length+"s|%"+col3length+"s|%"+col4length+".2f" +
                   "|%"+col4length+"s|%"+col4length+".2f|%"+col5length+"s|",

                   ++count,
                   shape.getClass().getSimpleName(),
                   shape.toString(),
                   shape.calculatePerimeter(),
                   getPerimeterFormula(shape),
                   shape.calculateArea(),
                   getAreaFormula(shape));

            System.out.println(singleTableLine);
        }
        System.out.println(tableBottomFrame);

    }

    private String getPerimeterFormula(Shape shape){
        switch (shape.getClass().getSimpleName()){
            case "Circle":
                return "2×π×r";
            case "Rectangle":
                return "2×a+2×b";
            case "Triangle":
                return "a+b+c";
            case "Square":
                return "4×a";
            case "EquilateralTriangle":
                return "3×a";
            case "RegularPentagon":
                return "5×a";
            default:
                return "error, check code";
        }
    }

    private String getAreaFormula(Shape shape){
        switch (shape.getClass().getSimpleName()){
            case "Circle":
                return "π×r×r";
            case "Rectangle":
                return "a×b";
            case "Triangle":
                return "sqrt(s×(s-a)×(s-b)×(s-c))";
            case "Square":
                return "a×a";
            case "EquilateralTriangle":
                return "a×a×sqrt(3)/4";
            case "RegularPentagon":
                return "a×a×sqrt(5×(5+2×sqrt(5))/4";
            default:
                return "error, check code";
        }
    }

    public SortShapeComparator getLargestShapeByPerimeter(){
        List<SortShapeComparator> sortShapeComparators = new ArrayList<>();

        for (Shape shape:this.shapesList) {
            sortShapeComparators.add(new SortShapeComparator(shape.getClass().getSimpleName(), shape.calculateArea(), shape.calculatePerimeter()));
        }

        Collections.sort(sortShapeComparators, Comparator.comparingDouble(SortShapeComparator::getShapePerimeter));
        int listLength = sortShapeComparators.size()-1;

        return sortShapeComparators.get(listLength);
    }

    public SortShapeComparator getLargestShapeByArea(){
        List<SortShapeComparator> sortShapeComparators = new ArrayList<>();

        for (Shape shape:this.shapesList) {
            sortShapeComparators.add(new SortShapeComparator(shape.getClass().getSimpleName(), shape.calculateArea(), shape.calculatePerimeter()));
        }

        Collections.sort(sortShapeComparators, Comparator.comparingDouble(SortShapeComparator::getShapeArea));
        int listLength = sortShapeComparators.size()-1;

        return sortShapeComparators.get(listLength);
    }

}
