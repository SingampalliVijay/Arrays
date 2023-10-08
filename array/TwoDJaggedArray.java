package kn.com.array;

import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("No.of Batch has:");
//	 Array Declaration

	String [][]arr=new String[scan.nextInt()][];
	System.out.println("Enter No.of Friends of Each batch");
//	Array Creation
     for(int i=0;i<arr.length;i++) {
	    arr[i]= new String[scan.nextInt()];
      }
//	 Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("A"+(i+1)+" Batch:");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(" Enter Name of Friend "+(j+1));
			arr[i][j]=scan.next();
			
		}System.out.println(" ");
	}
//	Array Traversing
	for(int i=0;i<arr.length;i++) {
		System.out.println("A"+(i+1)+"Batch");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Friend-"+(j+1)+" Name:"+arr[i][j]);
//			System.out.println(arr[i][j]);
		}
	}
scan.close();
	}
}
