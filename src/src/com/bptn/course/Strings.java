package src.com.bptn.course;

public class Strings {

	public static void main(String[] args) {
		
		String s1 = new String ("Hello");
		String s2 = new String ("Hello");
		
		//use .equals() method with class variable not == because it wont be the 
		//same as it will compare address 
		// so when we put the command new it doesn't use the same existing address
		
		if (s1.equals (s2)) {
			
			System.out.println("Strings are equal");
		} else 
			
			System.out.println("Strings are different");
		
		//another way of concatentating strings is .concat()
				String s3 = "Hi";
				String s4 = " BPTN";
				
				System.out.println(s3.concat(s4));
				// both work to concatenate
				System.out.println(s3 + s4);

	}
		
}
