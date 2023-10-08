//WAJP to display all the odd elements present in the even index of an array
package com.kn.arrays;

public class OddElementsInArray {

	public static void main(String[] args) {
	
		int arr[]= {10,23,34,44,55,23,46,56,78,67,89};
		
		System.out.println("Odd Elements in Even Index An Array");
    for(int i=0;i<arr.length;i++) {
    	if(i%2==0) {
    		if(arr[i]%2==1) {
    			System.out.println(arr[i]);
    		}
    	}
    }
	}
}
