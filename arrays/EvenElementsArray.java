//WAJP to display all the even elements present in an array
package com.kn.arrays;

public class EvenElementsArray {

	public static void main(String[] args) {
	
		int arr[]= {10,23,34,45,56,67,78};
		
		System.out.println("Even Elements in An Array");
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]%2==0) {
    		   System.out.println(arr[i]);
    	   }
       }
	}
}
