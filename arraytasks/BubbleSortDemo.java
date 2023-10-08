package com.kn.arraytasks;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Size");
	int []arr=new int[scan.nextInt()];
	
	System.out.println("Enter the Array Data");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	
	System.out.println("Array Before Sorted");
	for(int i:arr) {
		System.out.print(arr[i]+" ");	
	}
	System.out.println(" ");
	BubbleSort bubbleSort=new BubbleSort();
	bubbleSort.printBubbleSort(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}
