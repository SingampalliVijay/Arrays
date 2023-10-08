package kn.com.array;

import java.util.Scanner;

public class OddOrEvenArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Size");
    int []arr=new int[scan.nextInt()];
    System.out.println("Enter the data");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter data as Follows");
	for(int i=0;i<arr.length;i++) {	
		if(arr[i]%2==0) {
			System.out.print(arr[i]);
			System.out.println(" is Even");
		}else {
			System.out.print(arr[i]);
			System.out.println("is odd");
			
		}
	
	}	System.out.println("<< The End >>>");
	}
}
