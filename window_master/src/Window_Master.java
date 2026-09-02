import java.util.Scanner;

public class Window_Master {
    private static final int MAX_INPUT_ATTEMPTS = 5;

    public static void main(String[] args) {
        System.out.println("~~~ WINDOW MASTER ~~~");

        // Prompt user and take input
        System.out.println("Please enter your window's width");
        int width = retrieveNumericalInput();
        System.out.println("Please enter your window's height");
        int height = retrieveNumericalInput();

        // Create window and print cost
        Window window = new Window(width, height);
        System.out.println("Total window cost: " + window.getCost());
    }

    /**
     * Attempts to retrieve and parse numerical input from System.In
     * @return User inputted value
     */
    private static int retrieveNumericalInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= MAX_INPUT_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                return Integer.parseInt(inputVal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        throw new RuntimeException();
    }
}
