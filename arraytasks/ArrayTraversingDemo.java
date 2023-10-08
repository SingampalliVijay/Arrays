package com.kn.arraytasks;

import java.util.Scanner;

public class ArrayTraversingDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");
	
//	Array Declaration & Creation
	int []arr=new int[scan.nextInt()];
	
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter"+(i+1)+" Array Element");
		arr[i]=scan.nextInt();
	}
	
//	Object To Traversing
	ArrayTraversing arraytraversing=new ArrayTraversing();
	arraytraversing.PrintArrayTraversing(arr);
	
//	Close scanner
	scan.close();
	}
}
