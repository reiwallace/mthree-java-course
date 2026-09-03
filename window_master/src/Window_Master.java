import java.util.Scanner;

public class Window_Master {
    private static final int MAX_INPUT_ATTEMPTS = 5;

    public static void main(String[] args) {
        System.out.println("~~~ WINDOW MASTER ~~~");
        
       // Set window costs
       boolean askForCost = true;
       // Loop until the user has chosen to continue
       while(askForCost) {
           System.out.println("Current glass cost per sq foot: $" + Window.glassCostPerSqFoot);
           System.out.println("Current trim cost per linear foot: $" + Window.trimCostPerFoot);
           System.out.println("Do you want to change these values? \n Enter 1 to change glass cost \n Enter 2 to change trim cost \n Enter 3 to continue");
           int userInput = retrieveIntegerInput(); 
           switch(userInput) {
               case 1:
                   System.out.println("Please enter the amount you wish to set glass cost to");
                   Window.setGlassCost(retrieveDoubleInput());
                   break;

               case 2:
                   System.out.println("Please enter the amount you wish to set trim cost to");
                   Window.setTrimCost(retrieveDoubleInput());
                   break;

               case 3:
                   askForCost = false;
                   break;

               default:
                   System.out.println("Invalid option. Please try again.");
                   break;
           }
       }

        // Enter number of windows
        int numberOfWindows;
        System.out.println("How many windows would you like to calculate?");
        numberOfWindows = retrieveIntegerInput();
        
        // Prompt user and take input
        System.out.println("Please enter your window's width");
        double width = retrieveDoubleInput();
        System.out.println("Please enter your window's height");
        double height = retrieveDoubleInput();

        // Create window and print cost
        Window window = new Window(width, height);
        System.out.println("Total window cost: $" + window.getCost());
    }

    /**
     * Attempts to retrieve and parse integer input from System.In
     * @return User inputted value
     */
    private static int retrieveIntegerInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= MAX_INPUT_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                int val = Integer.parseInt(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        throw new RuntimeException();
    }

    /**
     * Attempts to retrieve and parse Double input from System.In
     * @return User inputted value
     */
    private static double retrieveDoubleInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= MAX_INPUT_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                double val = Double.parseDouble(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1.25, 2000.01). Please try again.");
                System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        throw new RuntimeException();
    }
}
