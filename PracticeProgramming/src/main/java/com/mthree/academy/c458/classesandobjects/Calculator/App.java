package com.mthree.academy.c458.classesandobjects.Calculator;

import com.mthree.academy.c458.utils.UserInputUtils;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class App {
    // Options enum to assign string titles to option types and provide an easy way to convert integers into options
    enum OPTION {
        ADD("add"),
        SUBTRACT("subtract"),
        MULTIPLY("multiply"),
        DIVIDE("divide"),
        EXIT("exit");

        private final String title;
        OPTION(String title) {
            this.title = title;
        }

        /**
         * Retrieves an option enum from int
         * @param x Option choice
         * @return OPTION enum - null if not a valid choice
         */
        public static OPTION fromInt(int x) {
            switch(x) {
                case 1:
                    return ADD;
                case 2:
                    return SUBTRACT;
                case 3:
                    return MULTIPLY;
                case 4:
                    return DIVIDE;
                case 5:
                    return EXIT;
                default:
                    return null;
            }
        }
    }

    private boolean running = true;

    public static void main(String[] args) {
        // Start app
        new App();
    }

    public App() {
        // Title
        println("--Calculator App--");

        // While the app is running prompt the user to give an option then handle the option
        while(running) {
            OPTION option = getUserOption();
            println("You chose " + option.title);
            handleOption(option);
        }
    }

    /**
     * Prompts the user for an option input and retrieves the option enum from the input
     * @return OPTION enum for the user's chosen option
     */
    private OPTION getUserOption() {
        // Display options menu
        println("\n-Main Menu-");
        println("Options:");
        println("1) Add    2) Subtract");
        println("3) Multiply    4) Divide");
        println("5) Exit");
        println("Please enter a number to select an operation you wish to perform.\n");

        // Retrieve option from user input and retrieve OPTION enum
        return OPTION.fromInt(UserInputUtils.retrieveIntegerInputInRange(1, 5));
    }

    /**
     * Handles a chosen option
     * @param option OPTION enum
     */
    private void handleOption(OPTION option) {
        // Handle exit separately before taking operands
        if(option == OPTION.EXIT) {
            exit();
            return;
        }

        // Take operands before running the calculator as all options take two operands
        println("Please enter your first operand");
        double operand1 = UserInputUtils.retrieveDoubleInput();

        println("Please enter your second operand");
        double operand2 = UserInputUtils.retrieveDoubleInput();

        // Initialise output variable
        double output = 0;

        // Run the calculator method depending on operand
        switch(option) {
            case ADD:
                output = SimpleCalculator.add(operand1, operand2);
                break;

            case SUBTRACT:
                output = SimpleCalculator.subtract(operand1, operand2);
                break;

            case MULTIPLY:
                output = SimpleCalculator.multiply(operand1, operand2);
                break;

            case DIVIDE:
                output = SimpleCalculator.divide(operand1, operand2);
                break;
        }

        // Print the output to the user
        println("The result is: " + output);
    }

    /**
     * Thanks the user for using the app and sets the app's running flag to false
     */
    private void exit() {
        running = false;
        println("Thank you for using Calculator App!");
    }
}
