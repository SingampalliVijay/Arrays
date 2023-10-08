package com.kn.arraytasks;

import java.util.Scanner;

public class CountOfEvenOrOddDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of an Array :");
//	Array Declaration & Creation
	int []arr=new int[scan.nextInt()];
	
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter "+(i+1)+" Element");
		arr[i]=scan.nextInt();
	}
	
//	Object Creation CountOfEvenOrOdd
	CountOfEvenOrOdd countOfEvenOrOdd= new CountOfEvenOrOdd();
	countOfEvenOrOdd.countEvenOrOddOfElements(arr);
	
//   close scan
	scan.close();
	}

}
