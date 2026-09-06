package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE
	 	// Try Catch to validate and give feedback on user input rather than throwing an exception
		try {
			// Read user input from the scanner and try to parse it into an integer
			num = Integer.parseInt(scanner.nextLine());

			// If the number is between integer 1 and 10 return the number
			// Since the number is returned here, the default return of -1 and the error message are never reached.
			if(num >= 1 && num <= 10) {
				printStream.println("You entered: " + num);
				return num;
			}

		} catch (NumberFormatException ignored) {} // Ignore catch as the default return handles exceptions

	 	// Default return - prints out an error and returns -1
		printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		return -1;

		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 
		int result = 1;
		//YOUR CODE STARTS HERE

	 	// Loop starts from 2 as the result is already 1
	 	// The result will be multiplied by all numbers from 2 up to the input number (including the input number)
		for(int i = 2; i <= num; i++) {
			result *= i;
		}

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();	
	 }

	
}
