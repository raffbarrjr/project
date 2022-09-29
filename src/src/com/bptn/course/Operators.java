package src.com.bptn.course;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Arithmetic Operators
		// + - * / %
		
		int a = 7;
		int b = 5;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)( a / b );
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		//modulus -> mod
		
		int mod = a % b;
		System.out.println(mod);
		
		
		//Comparison operator always returns boolean value
		
		boolean b1 = a > b; //greater than
		boolean b2 = a < b; //less than
		boolean b3 = a >= b; //greater than or equal
		boolean b4 = a <= b; //less than or equal
		boolean b5 = a == b; // Equal to
		boolean b6 = a != b; // Not Equal to
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		int f = 8;
		int g = 13;
		
		int h = f & g; // AND
		int i = f | g; //OR
		int j = f ^ g; //XOR
		
		
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		int a1 = 8; //1000
		int c1 = a1 >> 5;
		
		System.out.println(c1);
		
		long m1 = 1;
		long n1 = m1 << 31;
	
		
		System.out.println(n1);
		
		
		
		
String skyCondition = "Fall";

	if(skyCondition == "Blue") {
		System.out.println("Sunny");
		
	}
		
		
		
		
		
		

	}

}
