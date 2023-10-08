package com.kn.arraytasks;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sizes of An Array");
		
//		Array Declaration & Creation
		int arr[]=new int[scan.nextInt()];
		
		int brr[]=new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Element "+(i+1)+" of arr :");
			arr[i]=scan.nextInt();
		}
	
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter Element "+(i+1)+" of brr :");
			brr[i]=scan.nextInt();
		}
		
		int[] crr=mergeofarrays(arr,brr);
		for(int i=0;i<crr.length;i++) {
		System.out.print(crr[i]+" ");
         }
	}
//    Array Traversing
	static int[] mergeofarrays(int[] arr, int[] brr) {
		int crr[]=new int[arr.length+brr.length];
		System.out.println(" Merged Array is as Follows :");
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++) {
				crr[i]=brr[j];
				j++;
			}
		return crr;
	}
}
