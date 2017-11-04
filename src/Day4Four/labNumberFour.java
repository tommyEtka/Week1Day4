package Day4Four;

import java.util.Scanner;

public class labNumberFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		// System.out.println("Enter an integer between 1 -10:");
		long input = 0;
		String choice = "yes";

		Scanner scan1 = new Scanner(System.in);

		while (choice.equalsIgnoreCase("yes")) {
			long factorial = 1;
			System.out.println("Enter an integer between 1 -10:");
			input = scan1.nextInt();

			if (input >= 1 && input <= 10) {

				factorial = getFactorial(input, factorial);

				System.out.println("The factorial of " + input + " is "
						+ factorial + ".");

				System.out.println("Continue? yes or no");
				scan1.nextLine();
				choice = scan1.nextLine();

			}

			else {
				System.out.println("Invalid Number");
				// System.out.println("Enter an integer between 1 -10:");

			}

		}
		System.out.println("Goodbye");
		scan1.close();
	}

	public static long getFactorial(long input, long factorial) {

		for (int i = 1; i <= input; i++) {
			factorial *= i;

		}

		return factorial;
	}

}
