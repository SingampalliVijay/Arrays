package kn.com.array;

import java.util.Scanner;

public class GivenArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Given Value =");
//	Array Declaration & Creation
	int arr []=new int[4];
//	Array Initialization
	arr[0]=23;
	arr[1]=34;
	arr[2]=45;
	arr[3]=56;
	int num=scan.nextInt();
	boolean isgivennumber=givennumber(arr,num);
	System.out.println("The given "+num+" is in array ="+isgivennumber);
	System.out.println("<<< The End >>>");
	}

	private static boolean givennumber(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}	
		}
		return false;
	}
}
