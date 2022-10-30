package com.codecool.geometry.utilities;

import com.codecool.geometry.containers.ShapeCollection;

public class Display {

    public static void mainMenu(){
        StringBuilder sb=new StringBuilder();
        sb.append("\nPlease choose one of the number from the list below:\n\n");
        sb.append("Choose -1- to add new shape to the shape list\n");
        sb.append("Choose -2- to show all shapes\n");
        sb.append("Choose -3- to show the shape with the largest perimeter\n");
        sb.append("Choose -4- to show the shape with the largest area\n");
        sb.append("Choose -5- to see a formulas for a particular shape\n");
        sb.append("Choose -0- to exit the program\n");

        System.out.println(sb);
    }

    public static void shapeTypesMenu(){
        StringBuilder sb=new StringBuilder();
        sb.append("\nPlease choose shape type:\n\n");
        sb.append("Choose -1- to add Circle\n");
        sb.append("Choose -2- to add Rectangle\n");
        sb.append("Choose -3- to add Triangle\n");
        sb.append("Choose -4- to add Square\n");
        sb.append("Choose -5- to add Equilateral Triangle\n");
        sb.append("Choose -6- to add Regular Pentagon\n");

        System.out.println(sb);
    }

    public static void largestShapeByPerimeter(ShapeCollection shapeCollection) {
        String separator = "-";
        int numberOfTimesSeparatorIsRepeated = 100;
        StringBuilder sb=new StringBuilder();
        sb.append("|           Largest shape by perimeter is '");
        sb.append(shapeCollection.getLargestShapeByPerimeter().shapeName);
        sb.append("' with perimeter length equal ");
        sb.append(shapeCollection.getLargestShapeByPerimeter().shapePerimeter);
        sb.append(" m.");


        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
        System.out.printf("%"+ -(numberOfTimesSeparatorIsRepeated) + "s", sb);   //ToDo how to justify to the center - not only left or right
        System.out.println(" |");
        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
    }

    public static void largestShapeByArea(ShapeCollection shapeCollection) {
        String separator = "-";
        int numberOfTimesSeparatorIsRepeated = 100;
        StringBuilder sb=new StringBuilder();
        sb.append("|           Largest shape by area is '");
        sb.append(shapeCollection.getLargestShapeByArea().shapeName);
        sb.append("' with area equal ");
        sb.append(shapeCollection.getLargestShapeByArea().shapeArea);
        sb.append(" m2.");

        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
        System.out.printf("%"+ -(numberOfTimesSeparatorIsRepeated) + "s", sb);   //ToDo how to justify to the center - not only left or right
        System.out.println(" |");
        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
    }

    public static void equationsForAreaAndPerimeter(String shapeType) {
        String separator = "-";
        int numberOfTimesSeparatorIsRepeated = 125;
        StringBuilder sb=new StringBuilder();
        sb.append("|           Area equation for '");
        sb.append(shapeType);
        sb.append("' is ");
        sb.append(FormulaProvider.getAreaForShape(shapeType));
        sb.append(" and perimeter for '");
        sb.append(shapeType);
        sb.append("' is ");
        sb.append(FormulaProvider.getPerimeterForShape(shapeType));

        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
        System.out.printf("%"+ -(numberOfTimesSeparatorIsRepeated) + "s", sb);   //ToDo how to justify to the center - not only left or right
        System.out.println(" |");
        System.out.println("|"+separator.repeat(numberOfTimesSeparatorIsRepeated)+"|");
    }

}
