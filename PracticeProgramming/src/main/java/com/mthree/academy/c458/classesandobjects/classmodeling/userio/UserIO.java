package com.mthree.academy.c458.classesandobjects.classmodeling.userio;

public interface UserIO {
    /**
     * Prints out a string message
     * @param message Message to print
     */
    void print(String message);

    /**
     * Prompts the user and reads a string input
     * @param prompt Prompt printed to the user
     * @return User input
     */
    String readString(String prompt);

    /**
     * Prompts the user and reads an integer input
     * @param prompt Prompt printed to the user
     * @return User input
     */
    int readInt(String prompt);

    /**
     * Prompts the user and reads an integer input within range
     * @param prompt Prompt printed to the user
     * @param min the minimum value (inclusive to accept from the user)
     * @param max the maximum value (inclusive to accept from the user)
     * @return User input
     */
    int readInt(String prompt, int min, int max);

    /**
     * Prompts the user and reads a double input
     * @param prompt Prompt printed to the user
     * @return User input
     */
    double readDouble(String prompt);

    /**
     * Prompts the user and reads a double input within range
     * @param prompt Prompt printed to the user
     * @param min the minimum value (inclusive to accept from the user)
     * @param max the maximum value (inclusive to accept from the user)
     * @return User input
     */
    double readDouble(String prompt, double min, double max);

    /**
     * Prompts the user and reads a float input
     * @param prompt Prompt printed to the user
     * @return User input
     */
    float readFloat(String prompt);

    /**
     * Prompts the user and reads a float input within range
     * @param prompt Prompt printed to the user
     * @param min the minimum value (inclusive to accept from the user)
     * @param max the maximum value (inclusive to accept from the user)
     * @return User input
     */
    float readFloat(String prompt, float min, float max);

    /**
     * Prompts the user and reads a long input
     * @param prompt Prompt printed to the user
     * @return User input
     */
    long readLong(String prompt);

    /**
     * Prompts the user and reads a long input within range
     * @param prompt Prompt printed to the user
     * @param min the minimum value (inclusive to accept from the user)
     * @param max the maximum value (inclusive to accept from the user)
     * @return User input
     */
    long readLong(String prompt, long min, long max);

}
