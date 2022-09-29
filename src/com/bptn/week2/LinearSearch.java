package com.bptn.week2;

public class LinearSearch {

	public static void main(String[] args) {
		
		
		int key = 15;
		int ind = -1;
		
		int[] a = {3, 8, 4, 2, 12, 6};
		
		for ( int i=0; i< a.length; i++)
			if (key == a[i]) {
				ind = i;
				
				break; //breaks out of the for loop
			}
		
			System.out.println(" Index ; " + ind);
	}

}
