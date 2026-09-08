package com.mthree.academy.c458.interfaces.learning;

public interface Vehicle {
    void moveForward(int milesPerHour);
    void moveBackward(int milesPerHour);
    void stop();
    void turnLeft();
    void turnRight();
    void engineOn();
    void engineOff();
}
