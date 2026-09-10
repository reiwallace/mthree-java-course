package com.mthree.academy.c458.classesandobjects.shapesandperimeters;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        println("Area: " + circle.getArea());

        Shape square = new Square(10);
    }
}
