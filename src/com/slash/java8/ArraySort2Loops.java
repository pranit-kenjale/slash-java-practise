package com.slash.java8;

public class ArraySort2Loops {
	
	public static void main(String args[]) {
		
		//Array sort - Ascending Order - 2 Loops
		int temp=0;
		int[] arr = {3,5,1,9,7,0,-385};
		
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		for(int element: arr) {
			System.out.println("Sorted array; Ascending Order - 1 Loop -\t" + element);
		}

	}
}
