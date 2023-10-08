package com.kn.arraytasks;

import java.util.Scanner;

public class ArrayReversingDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		
//		Array Declaration & Creation
		int []arr=new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter"+(i+1)+" Array Element");
			arr[i]=scan.nextInt();
		}
		
//		Object To Traversing
		ArrayReversing arrayreversing=new ArrayReversing();
		arrayreversing.Printreversingarray(arr);
		
//		close scan
		scan.close();

	}

}
