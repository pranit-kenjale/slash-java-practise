package com.slash.java8;

public class ArraySort1Loop {
	
	public static void main(String args[]) {
		
		//Array sort - Ascending Order - 1 Loop
		int temp=0;
		int[] arr = {3,+5,1,3,3,0,-385};
		
		for(int i=0, j=i+1; i<arr.length && j<arr.length;) {
			
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				//Initialize counters to start from the beginning
				i=0;
				j=i+1;
				
			}else {
				i++;
				j++;
			}
		}
		
		for(int element: arr) {
			System.out.println("Sorted array; Ascending Order - 1 Loop -\t" + element);
		}
		
	}

}
