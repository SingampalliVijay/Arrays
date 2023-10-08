package com.kn.arraytasks;

import java.util.Scanner;

public class InsertionSortArrayDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Elements");
	
//		Array Declaration & Creation
//		int []arr= {135,79,48,69,21,99,32,58,19,6};
		int []arr=new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Before Array Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
//		Object Creation to InsertionSortArray
		InsertionSortArray sort=new InsertionSortArray();
		sort.printinsertionSort(arr);
		System.out.println("After Array Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
