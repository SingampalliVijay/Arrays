package com.kn.arraytasks;

import java.util.Scanner;

public class BubbleSortedArrayDemo {

	public static void main(String[] args) {
		int []arr= {45,34,67,12,56,1,23};
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Data");
//		int []arr=new int[scan.nextInt()];
//		
//		System.out.println("-- Array Elements --");
//		for(int i=0;i<arr.length;i++) {
//		 arr[i]=scan.nextInt();
//		}
		 
		System.out.println("-- Array Before Sorted --");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("     ***    ");
		System.out.println(" ");
		
//		Object Creation for BubbleSortedArray
		BubbleSortedArray bubblesortedArray=new BubbleSortedArray();
		bubblesortedArray.printSortedArray(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}

/*
 * Enter the Data
7
-- Array Elements --
43
43
67
12
56
34
23
-- Array Before Sorted --
43 43 67 12 56 34 23  
     ***    
 
<<< Sorted Array >>>
12 23 34 43 43 56 67 
 */