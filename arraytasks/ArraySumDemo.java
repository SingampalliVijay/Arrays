package com.kn.arraytasks;

import java.util.Scanner;

public class ArraySumDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Size");
//   Array Declaration & creation
		int []arr=new int[scan.nextInt()];
		
//		Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element"+(i+1));
			arr[i]=scan.nextInt();
		}
		
//		Object Creation of sumofarray
		ArraySum arraysum=new ArraySum();
//		arraysum.sumofarray(arr);
		System.out.println("Sum of Elements is :"+arraysum.sumofarray(arr));
//		Close scan
		scan.close();
	}
}
