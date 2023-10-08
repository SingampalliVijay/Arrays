//WAJP to display all the elements of an array in reverse order
package com.kn.arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int arr[]= {23,34,45,56,67,78,89};
		System.out.println("Reverse Order of An  Array");
//		for(int i=arr.length-1;i>=0;i--) {
//      System.out.println(arr[i]);
//	}
		int i=0,j=arr.length-1;
		while(i<=j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
