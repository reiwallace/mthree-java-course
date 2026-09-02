import java.util.Scanner;

public class scanner_test {
    private static final int NUMBER_ATTEMPTS = 3;
    private static int sum = 0;

    public static void main(String[] args) {
        inputAdder();
    }

    private static void noInputAdder() {
        int operand1 = 3;
        int operand2 = 4;

        // Add operands and print sum
        sum = operand1 + operand2;
        System.out.println("Sum is : " + sum);
    }

    private static void inputAdder() {
        // Prompt the user then take inputs
        System.out.println("Please enter the first number to be added: ");
        sum += retrieveNumericalInput();

        System.out.println("Please enter the next number to be added: ");
        sum += retrieveNumericalInput();

        // Print final output
        System.out.println("Sum is : " + sum);
    }

    /**
     * Attempts to retrieve and parse numerical input from System.In
     * @return User inputted value
     */
    private static int retrieveNumericalInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= NUMBER_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                return Integer.parseInt(inputVal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (NUMBER_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded. Returning 0.");
        return 0;
    }
}