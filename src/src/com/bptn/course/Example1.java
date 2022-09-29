package src.com.bptn.course;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		//type variableName = value
		// variableName conditions => no spaces between
		int num1 = 10;
		char firstCharOfName = 'k';
		float floatValue = (float)56.2;
		
		//System.out.println(<variable>);
		
		System.out.println(num1);
		System.out.println(firstCharOfName);
		System.out.println(floatValue);
		
		//WAP to add two numbers using variables
		int numa = 10;
		int numb = 20;
		
		//reinitializing a variable with a different value
			numa = 20;
			numb = 30;
		

		int sum = numa + numb; // will store the value of sum (numa&numb)
		
		
		numb = 50;
		
		
		//we cant have the same variable name inside a block
		System.out.println(10+20);
		System.out.println(numa + numb);
		System.out.println(sum);
		
		
		//assign another value
		
		//String data type
		
		String firstName = "Simisola";
		String lastName = "Ajayi";
		String dateOfJoining = "September 2022";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		//Use concatenation
		
		System.out.println(firstName + lastName);
		System.out.println(firstName + " " + lastName);
		System.out.println("Hello, My name is Simisola Ajayi. I started this bootcamp in September 2022");
		System.out.println("Hello, My name is " + firstName + " " + lastName + ". I started this bootcamp in " + dateOfJoining);
		
		
		
			
		

	}

}
