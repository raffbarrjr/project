package src.com.bptn.course;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);// Creates a Scanner object so we can read info from the keyboard.
		
		System.out.println("Enter Username: ");
		
		String username = myObj.nextLine(); // Reads a String from the console.
		
		System.out.println( "Hello "  + username); //Display a Hello.

	}

}
