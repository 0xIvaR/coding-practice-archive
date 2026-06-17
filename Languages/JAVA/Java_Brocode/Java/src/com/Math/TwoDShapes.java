package com.Math;

public class TwoDShapes {
    public static void main(String[] args) {

        int side = 4;
        int length = 9;
        int width = 6;
        int base = 4;
        int height = 6;

        //=========
        // SQUARE
        //=========

        //Area
        int area = side * side;

        //Perimeter
        int perimeter = 4 * side;

        // Diagonal
        double diagonal = Math.sqrt(side * side + side * side);

        // ====================
        // RECTANGLE
        // ====================

        // Area
        int areaRect = length * width;

        // Perimeter
        int perimeterRect = 2 * (length + width);

        // Diagonal
        double diagonalRect = Math.sqrt(length * length + width * width);


        // ====================
        // TRIANGLE
        // ====================

        // Area
        int areaTriangle = (base * height) / 2;

        // Perimeter
        int side1 =6;
        int side2 = 2;
        int side3 = 7;
        int perimeterTriangle = side1 + side2 + side3;


        // ====================
        // RIGHT TRIANGLE
        // ====================

        // Hypotenuse
        double baseRight = 3;
        double heightRight = 4;

        double hypotenuse =
                Math.sqrt(baseRight * baseRight + heightRight * heightRight);

        System.out.println(hypotenuse);
    }
}
