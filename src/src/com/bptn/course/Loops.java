package src.com.bptn.course;

public class Loops {

	public static void main(String[] args) {
		
		//i++ == i = i+1
		
		// initialization; condition for executing the loop; increment the value
		
		int [] arr = {3, 4, 5, 6, 7};
		
		// traditional for offers more control
		
		for(int i = 0; i < arr.length; i++) {
			// does not print the index at position 2 which is 5
			if (i!=2) {
			
			System.out.println(arr[i]);
			}
			
		}
		
		//For each loop to look over each element of an array
		
		for (int num : arr) {
		// doesnt print the number in the array	
			if (num != 5) {
			System.out.println(num);
		}

	}

}
}
