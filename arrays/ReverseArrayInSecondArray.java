//WAJP to display all the elements of an array in another array reverse order
package com.kn.arrays;

public class ReverseArrayInSecondArray {

	public static void main(String[] args) {
	
		int []arr= {12,23,34,45,56,67,78,89,90};
		int brr[]=new int[arr.length];
	    for(int i=arr.length-1;i>=0;i--) { 
	    	brr[i]=arr[i];
			System.out.println(brr[i]);
		}
	}

}
