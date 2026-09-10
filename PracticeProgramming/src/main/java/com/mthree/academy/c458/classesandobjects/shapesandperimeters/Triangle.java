package com.mthree.academy.c458.classesandobjects.shapesandperimeters;

public class Triangle extends Shape {
    public Triangle() {}
    public Triangle(double[] sides) {
        setSides(sides);
        setName("Triangle");
    }

    @Override
    public void setArea() {
        double semiPerimeter = (sides[0] + sides[1] + sides[2]) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) * (semiPerimeter - sides[2]));
    }

    @Override
    public void setSides(double[] sides) {
        // Check side length
        if(sides.length != 3) {
            throw new IllegalArgumentException("Triangles must have 3 sides!");
        }

        // Check if the provided sides can form a triangle
        if(
                sides[0] + sides[1] <= sides[2] ||
                sides[2] + sides[1] <= sides[0] ||
                sides[0] + sides[2] <= sides[1]
        ) {
            throw new IllegalArgumentException("These sides cannot make a triangle");
        }

        // Set sides and calculate area/perimeter
        this.sides = sides;
        setPerimeter();
        setArea();
    }
}
