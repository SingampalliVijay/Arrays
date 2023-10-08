package kn.com.array;

import java.util.Scanner;

public class PositiveNumberCountInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");	
		
//	 Array Declaration and Creation
		int [] arr=new int[scan.nextInt()];
		
//	Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number "+(i+1)+ " in an Array:");
			arr[i]=scan.nextInt();
		}
		
//	Call a Method to find the count in an array
		int findcountofpositivenumber=positivenumber(arr);
		System.out.println("The Count is "+findcountofpositivenumber);
	scan.close();
	}
	
//		Method to find the count in an array
	private static int positivenumber(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				count++;
			}
		}
		return count;
	}

}
