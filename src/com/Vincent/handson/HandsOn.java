package com.Vincent.handson;

import java.util.Scanner;

public class HandsOn {

	public static void main(String[] args) {
		/*
		 * Currency Converter
		 */
		
		//Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		String letter; //Container for letter associated with currency
		String currency = "None"; //Container for name of currency
		double initialAmount;
		double amountConverted = 0;
		
		// Input
		System.out.println("Currency Exchange");
		System.out.println("Currency to convert to U.S. dollars:");
		System.out.println("e = Euros");
		System.out.println("c = Chinese Yuan");
		System.out.println("r = Indian Rupees");
		System.out.println("b = Bitcoint");
		System.out.println("Enter currency to convert to U.S. dollars:");
		letter = input.next(); 
		
		//Input validation, return an error and ask to enter a correct input
		while (!letter.equals("e") && !letter.equals("c") && 
		    !letter.equals("r") && !letter.equals("b")) {
			System.out.println("Incorrect input. Please, enter e, c, r, or b"); 
		    System.out.println("e = Euros, c = Chinese Yuan, r = Indian Rupees, b = Bitcoin:"); 
		    letter = input.next(); 
		}
		
		//Switch case to match currency
		switch (letter) {
		    case "e": currency = "Euros"; break;
		    case "c": currency = "Chinese Yuan"; break;
		    case "r": currency = "Indian Rupee"; break;
		    case "b": currency = "Bitcoin"; break;
		}
		//Input for amount of currency to convert
		System.out.println("Amount of " + currency + " to convert:");
		initialAmount = input.nextDouble();
		
		//Currency conversion logic
		switch (letter) {
		    case "e": amountConverted = initialAmount * 1.16; break;
	        case "c": amountConverted = initialAmount * .15; break;
	        case "r": amountConverted = initialAmount * 0.01516; break;
	        case "b": amountConverted = initialAmount * 6923.80; break;
		}
		
		//Round amountConverted with Math class and print result
		System.out.println("That converts to: $" + Math.round(amountConverted * 100) / 100);
		
		
		/*
		 * Sum of digits program
		 */
		
		// Initialize variables
		int num;
		int sum = 0;
		
		//Input
		System.out.println("\nSum the digits");
		System.out.print("Enter a whole number: ");
		num = input.nextInt(); //Takes input as int
		
		//Input validation, return an error and ask to enter a correct input
		if (num<=0) {
			System.out.println("Invalid Input.");
			System.out.println("Please enter a positive integer:");
			num = input.nextInt();
		}
		
		// Loop through the digits and calculate the sum
		for (sum = 0; num!=0; num /= 10) {
		
		    sum += num%10; // Add remainder to the sum
		}
		
		//Print results
		System.out.print(sum);

		/*
		 * Reverse digits of a number
		 */
		
		//Initialization
		int userNum;
		int reverse = 0;
		int remainder;
		
		//Input
		System.out.println("\n\nDigit Reverse Program");
		System.out.println("Please enter a whole number:");
		userNum = input.nextInt();
		
		//run loop until userNum = 0
		while (userNum != 0) {
			remainder = userNum%10;
			reverse = reverse * 10 + remainder;
			userNum /= 10;
		}
		
		System.out.println(reverse);
		
		if (input!=null) {
			input.close();
		}
	}
}
		
