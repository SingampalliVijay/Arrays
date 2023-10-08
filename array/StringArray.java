package kn.com.array;

import java.util.Scanner;

public class StringArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

/*	//	 Array Declaration
	String []arr;
//	 Array creation
	System.out.println("Enter the String length");
	arr=new String[scan.nextInt()];
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the "+(i+1)+" String data");
		arr[i]=scan.next();
	}
//	Array Traversing
	System.out.println("Array data are as follows :");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}*/
	
	
//	Array Declaration
	String[] arr;
//	Array Creation
	System.out.println("Enter the length");
	arr=new String[scan.nextInt()];
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the "+(i+1)+" string");
		arr[i]=scan.next();
	}
//	 Array Back Traversing
	System.out.println("Array data are as follows:");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]);
	}
}
}
