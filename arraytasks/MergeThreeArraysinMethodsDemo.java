package com.kn.arraytasks;

import java.util.Scanner;

public class MergeThreeArraysinMethodsDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Sizes Of 1st Array");
//  Array Declaration & Creation
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the Sizes Of 2nd Array");
	int brr[]=new int[scan.nextInt()];
	System.out.println("Enter the Sizes Of 3rd Array");
	int crr[]=new int[scan.nextInt()];
	
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of 1st Array");
		arr[i]=scan.nextInt();
	}

	for(int i=0;i<brr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of 2nd Array");
		brr[i]=scan.nextInt();
	}
	
	for(int i=0;i<crr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of 3rd Array");
		crr[i]=scan.nextInt();
	}
//   Object Creation
	MergeThreeArraysinMethods mergethreemethods=new MergeThreeArraysinMethods();
	 mergethreemethods.printMergeArrays(arr, brr, crr);
	scan.close();
}
}