package kn.com.array;

import java.util.Scanner;

public class EvenOrOddArray {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the data");
    int []arr=new int[scan.nextInt()];
    System.out.println("Enter the Initialization");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=scan.nextInt();
    }
  /*  for(int i=0;i<arr.length;i++) {
    	if(arr[i]%2==0) {
    		  System.out.print(arr[i]);
    		System.out.println(" is Even");
    	
    	}
    }*/
  
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]%2==1) {
    		System.out.print(arr[i]);
    		System.out.println(" is odd");
    	  }
        }
	}
}
