//WAJP to store odd index elements into even position,even index elements into odd index of another array
package com.kn.arrays;

public class SwapIndexValues {

	public static void main(String[] args) {
	
		
		int arr[]= {5,2,3,4,6,8};
		
		for(int i=0;i<arr.length;i+=2) 
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}

	}
}
