package com.mthree.academy.c458.classesandobjects.classmodeling;

public class House {
    private double area;
    private double width;
    private double height;

    private String address;

    public House() {}
    public House(String address) {
        this.address = address;
    }

    public House(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
