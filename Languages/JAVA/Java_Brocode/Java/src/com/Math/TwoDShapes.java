package com.Math;

public class TwoDShapes {

    public static double squareArea(double side) {
        return side * side;
    }

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static double squareDiagonal(double side) {
        return Math.sqrt(side * side + side * side);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double rectangleDiagonal(double length, double width) {
        return Math.sqrt(length * length + width * width);
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static double rightTriangleHypotenuse(double base, double height) {
        return Math.sqrt(base * base + height * height);
    }
}
