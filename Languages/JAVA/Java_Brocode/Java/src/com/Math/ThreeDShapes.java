package com.Math;

public class ThreeDShapes {
    public static void main(String[] args) {

        double side = 5;

        double length = 10;
        double width = 4;
        double height = 3;

        // Cube Volume
        double cubeVolume = Math.pow(side, 3);

        // Cube Surface Area
        double cubeSurfaceArea = 6 * side * side;

        // Cuboid Volume
        double cuboidVolume =
                length * width * height;

        // Cuboid Surface Area
        double cuboidSurfaceArea =
                2 * ((length * width)
                        + (length * height)
                        + (width * height));

        System.out.println("Cube Volume = " + cubeVolume);
        System.out.println("Cube Surface Area = " + cubeSurfaceArea);

        System.out.println("Cuboid Volume = " + cuboidVolume);
        System.out.println("Cuboid Surface Area = " + cuboidSurfaceArea);
    }
}
