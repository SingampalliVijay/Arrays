//WAJP to replace all the numbers that are multiple of 2 by -1 
package com.kn.arrays;

public class MultipleOf2 {

	public static void main(String[] args) {
	
		int arr[]= {23,43,44,56,1,22,68,70,40,2};
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0) {
			arr[i]=-1;
			}
			System.out.println(arr[i]);
		}

	}
}
