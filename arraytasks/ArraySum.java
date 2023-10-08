package com.kn.arraytasks;

public class ArraySum {
   public int sumofarray(int []arr) {
//	   Method call to sumofarray
//	   System.out.println("Sum of the elements is :");
	   int sum =0;
	   for(int i=0;i<arr.length;i++) {
		   sum =sum+arr[i];
	   } 
	return sum;
   }
}
