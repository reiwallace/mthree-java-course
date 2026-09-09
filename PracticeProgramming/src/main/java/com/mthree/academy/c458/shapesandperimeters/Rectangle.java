package com.mthree.academy.c458.shapesandperimeters;

public class Rectangle extends Shape {
    public Rectangle() {}
    public Rectangle(double width, double height) {
        setSides(new double[]{width, height, width, height});
        setName("Rectangle");
    }

    @Override
    protected void setArea() {
        area = sides[0] * sides[1];
    }

    @Override
    public void setSides(double[] sides) {
        // Set sides and calculate area/perimeter
        this.sides = sides;
        setPerimeter();
        setArea();
    }
}
