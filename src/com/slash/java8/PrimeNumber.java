package com.slash.java8;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 20;
		int i;

		// Prime Number
		if (number <= 1)
			System.out.println(number + " is not a Prime number!");

		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not a Prime number!");
				break;
			}
		}

		//i == number, when no number is able to divide the test number
		if (i == number)
			System.out.println(number + " is a Prime number!");

	}

}
