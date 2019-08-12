package com.slash.java8;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortUsingArraysUtil {
	
	ArraySortUsingArraysUtil(){
	}
	
	public static void main(String args[]) {
		
      //Array sort - Ascending Order - Arrays Utils
      Integer[] arr = {3,5,1,9,7,0,-385};
      
      Arrays.sort(arr);
      System.out.println("Sorted array; Ascending Order - Array Utils -\t" + Arrays.toString(arr));
      
      for(int element: arr) {
          System.out.println("Sorted array; Ascending Order - Array Utils -\t" + element);
      }

      
      
      //Array sort - Descending Order - Arrays Utils
      Collections.reverse(Arrays.asList(arr));
     // System.out.println("\nSorted array - Descending Order:\t" + Arrays.asList(arr));
      
      System.out.println(Arrays.toString(arr));
      
      
      //Sort individual words of a string and print - Rocket
      String str = "Life Insurance Corporation Of India!";
      String[] strArray = str.split(" ");
      
      Arrays.sort(strArray);
      
      System.out.println("\n\nSorted array:\t" + Arrays.toString(strArray));
      System.out.println("Sorted array:\t" + String.join(" ", strArray));

	}
}
