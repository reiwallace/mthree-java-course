package com.mthree.academy.c458.classesandobjects.classmodeling.userio;

import java.util.Scanner;

public class BasicIO implements UserIO {
    private static Scanner input = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        return input.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return Integer.parseInt(input.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int num = 0;
        do {
            print(prompt);
            num = Integer.parseInt(input.nextLine());
        } while(num < min || num > max);
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        return Double.parseDouble(input.nextLine());
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double num = 0;
        do {
            print(prompt);
            num = Double.parseDouble(input.nextLine());
        } while(num < min || num > max);
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        return Float.parseFloat(input.nextLine());
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float num = 0;
        do {
            print(prompt);
            num = Float.parseFloat(input.nextLine());
        } while(num < min || num > max);
        return num;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        return Long.parseLong(input.nextLine());
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long num = 0;
        do {
            print(prompt);
            num = Long.parseLong(input.nextLine());
        } while(num < min || num > max);
        return num;
    }
}
