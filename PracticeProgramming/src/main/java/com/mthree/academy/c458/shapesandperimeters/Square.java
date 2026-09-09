package com.mthree.academy.c458.shapesandperimeters;

public class Square extends Shape {
    public Square() {}
    public Square(double sideLength) {
        setSides(new double[]{sideLength, sideLength, sideLength, sideLength});
        setName("Square");
    }

    @Override
    protected void setArea() {
        area = sides[0] * sides[0];
    }

    @Override
    public void setSides(double[] sides) {
        this.sides = sides;
        setArea();
        setPerimeter();
    }
}
