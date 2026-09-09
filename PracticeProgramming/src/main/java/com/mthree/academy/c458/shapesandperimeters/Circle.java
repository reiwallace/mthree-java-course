package com.mthree.academy.c458.shapesandperimeters;

public class Circle extends Shape {
    protected double radius;

    public Circle() {}
    public Circle(double circumference) {
        setSides(new double[]{circumference});
        setName("Circle");
    }

    @Override
    protected void setArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void setSides(double[] sides) {
        // Set sides and calculate area/perimeter
        this.sides = sides;
        calculateRadius();
        setPerimeter();
        setArea();
    }

    private void calculateRadius() {
        radius = sides[0] / (2 * Math.PI);
    }
}
