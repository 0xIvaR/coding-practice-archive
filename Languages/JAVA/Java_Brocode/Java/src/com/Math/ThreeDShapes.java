package com.Math;

public class ThreeDShapes {

    public static double cubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double cubeSurfaceArea(double side) {
        return 6 * side * side;
    }

    public static double cubeTotalEdgeLength(double side) {
        return 12 * side;
    }

    public static double cuboidVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double cuboidSurfaceArea(double length, double width, double height) {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    public static double cuboidSpaceDiagonal(double length, double width, double height) {
        return Math.sqrt(length * length + width * width + height * height);
    }
}
