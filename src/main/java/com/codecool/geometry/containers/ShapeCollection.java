package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

    private List<Shape> shapesList;

    public ShapeCollection() {
        this.shapesList = new ArrayList<>();
    }


    public void addShape (Shape shape) {
        this.shapesList.add(shape);
    }

    public void addShape (Shape... shapes) {
        for (Shape shape:shapes) {
            this.shapesList.add(shape);
        }
    }

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
                   getFormulaPerimeter(shape),
                   shape.calculateArea(),
                   getFormulaArea(shape));

            System.out.println(singleTableLine);
        }
        System.out.println(tableBottomFrame);

    }

    private String getFormulaPerimeter(Shape shape){
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

    private String getFormulaArea(Shape shape){
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



}
