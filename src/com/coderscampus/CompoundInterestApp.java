package com.coderscampus;

import java.util.Scanner; // Ctrl + Shift + O

public class CompoundInterestApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String initialInvestmentIn = collectInput(scanner, "What is the initial investment amount?");
		String interestRateIn = collectInput(scanner, "What is the interest rate?");

		double newBalanceDbl = Integer.parseInt(initialInvestmentIn);
		double interestRateDbl    = Double.parseDouble(interestRateIn);
		
		for (int i = 0; i < 6; i++) {
			newBalanceDbl = outputAndCalculate(newBalanceDbl, interestRateDbl, i); // breakpoint
		}

		scanner.close();
	}

	private static double outputAndCalculate(double newBalance, double interestRate, int index) {
		for (int j = 0; j < 5; j++) {
			newBalance = newBalance * (interestRate + 1.00);
		}
		System.out.println("After " + ((index * 5) + 5) + " years, you will have $" + Math.round(newBalance));
		return newBalance;
	}

	// right-click -> Refactor -> Extract Method
	// Shift + Ctrl + F -> Format (delete empty lines)
	private static String collectInput(Scanner scanner, String messageToDisplay) {
		System.out.println(messageToDisplay);
		String userInput = scanner.nextLine();
		return userInput;
	}

}
