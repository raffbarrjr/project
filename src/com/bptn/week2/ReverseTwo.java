package com.bptn.week2;

public class ReverseTwo {

	public static void main(String[] args) {
		/*
		 * number = 1234
		 * remainder = 1234 % 10
		 * reverse = 0*10 +4 = 0+4
		 * number = 123
		 */
		
		int num = 1234; // Decimal System
		String reverse = "";
		int remainder = 0;
		
		while ( num > 0) {
			
			remainder = num % 10; // Grab the last digit of the number
			
			reverse = reverse + remainder; //Append the last digit to the reverse number
			
			num = num / 10; // Remove the last digit of the number
			
		}

			System.out.println("The reverse number is:" + reverse);
	}

}
