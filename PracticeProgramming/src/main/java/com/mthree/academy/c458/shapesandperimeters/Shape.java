package com.mthree.academy.c458.shapesandperimeters;

public abstract class Shape {
    protected double[] sides;
    protected String name;
    protected double area;
    protected double perimeter;

    public Shape() {}

    protected abstract void setArea();
    public abstract void setSides(double[] sides);

    protected void setPerimeter() {
        perimeter = 0;
        for(double side : sides) {
            perimeter += side;
        }
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double[] getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
