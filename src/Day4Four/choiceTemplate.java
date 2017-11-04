package Day4Four;

import java.util.Scanner;

public class choiceTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")){
			
			
			System.out.println("Continue?");
			choice = scan1.nextLine();
		}
		
		scan1.close();

	}

}
