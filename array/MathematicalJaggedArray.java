package kn.com.array;

import java.util.Scanner;

public class MathematicalJaggedArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
//	Array Declaration & Creation
	System.out.println("Enter the size of the Array1:");
	int arr[]=new int[scan.nextInt()];
	
	System.out.println("Enter the size of the Array2:");
	int []brr=new int[scan.nextInt()];
	
	System.out.println("Enter the size of the Array3:");
    int crr[]=new  int[scan.nextInt()];
	
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the Value array"+(i+1));
		arr[i]=scan.nextInt();
	}

	for(int i=0;i<brr.length;i++) {
		System.out.println("Value"+(i+1));
		brr[i]=scan.nextInt();
	}
	findsumandproduct(arr,brr,crr);
	}
//   Array Traversing
	static void findsumandproduct(int[] arr, int[] brr, int[] crr) {
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]+brr[i];
			System.out.println("Sum indexing"+(i)+" ="+crr[i]);
		}
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]*brr[i];
			System.out.println("Product indexing "+(i)+" ="+crr[i]);
		}
	}
}