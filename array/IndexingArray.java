package kn.com.array;

import java.util.Scanner;

public class IndexingArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//	 Array Declaration and Creation
		int arr[]=new int[5];
	System.out.println("The data is");
//	 Array Initialization
     arr[0]=23;
     arr[1]=34;
     arr[3]=35;
     arr[2]=74;
     arr[4]=45;
     System.out.println(arr[scan.nextInt()]);
	}
}
