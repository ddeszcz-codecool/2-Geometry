package com.codecool.geometry.utilities;

public class FormulaProvider {

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getPerimeterForShape(String shape) {
        switch (shape){
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

    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getAreaForShape(String shape) {
        switch (shape){
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
