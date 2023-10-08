package com.kn.arraytasks;

import java.util.Scanner;

public class MergeThreeArrays {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Sizes Of an Array");
//     Array Declaration & Creation
	int arr[]=new int[scan.nextInt()];
	
	int brr[]=new int[scan.nextInt()];
	
	int crr[]=new int[scan.nextInt()];
	
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of arr :");
		arr[i]=scan.nextInt();
	}

	for(int i=0;i<brr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of brr :");
		brr[i]=scan.nextInt();
	}
	
	for(int i=0;i<crr.length;i++) {
		System.out.println("Enter Element "+(i+1)+" of crr :");
		crr[i]=scan.nextInt();
	}
	int []drr=mergethreearrays(arr,brr,crr);
	for(int i=0;i<drr.length;i++) {
		System.out.print(drr[i]+" ");
	}
	scan.close();
	}
	static int[] mergethreearrays(int[] arr, int[] brr, int[] crr) {
		int drr[]=new int[arr.length+brr.length+crr.length];
		System.out.println("Merged Array is as Follows:");
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<arr.length+brr.length;i++) {
				drr[i]=brr[j];
				j++;
			}
		int k=0;
		for(int i=arr.length+brr.length;i<drr.length;i++) {
				drr[i]=crr[k];
				k++;
			}
		return drr;
	}
}
