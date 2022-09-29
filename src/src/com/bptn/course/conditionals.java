
package src.com.bptn.course;

public class conditionals {

	public static void main(String[] args) {
	
		//Nested conditionals / Nested If Statements
		int a = 4;
		int b = 2;
		
		int c = 5;
		
		if ( a > b ) {
			
			if (a < c ) {
				System.out.println(a + " is smaller than " + c);
			} else {
				System.out.println(a + " is bigger than " + c);
			}
			
		} else {
			System.out.println(a + " is smaller than" + b);
		}
		
	
		

//		if (a > b) {
//			System.out.println(a + " is bigger than " + b);
//		} 
//		else if (a < b) {
//			System.out.println(a + " is smaller than " + b );
//			
//		}
//		else {
//			System.out.println(a + " is equal to " + b );
//			
//		}
	}
//
}
