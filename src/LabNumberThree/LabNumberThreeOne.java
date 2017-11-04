package LabNumberThree;

import java.util.Scanner;

public class LabNumberThreeOne {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int input = scan1.nextInt();
		scan1.nextLine();
		

		System.out.println("Number\tSquared\tCubed\t");
		System.out.println("======\t======\t======\t");
		
	
		
	

		getPower(input);

		scan1.close();
	}

	public static void getPower(int input) {
		for (int i=1; i<=input; i++) {
			int getSquared = i * i;
			int getCubed = i * i * i;
			
			//input = scan1.nextInt(); this missed up the whole code!!!
			System.out.println(i+"\t"+getSquared+"\t"+getCubed+"\t");

		}
	}

}

