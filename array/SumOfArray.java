package kn.com.array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int []arr;
		System.out.println("Enter the data length");
        arr=new int[scan.nextInt()];
        
        System.out.println("Enter Initialization");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        }
        System.out.println(sum);
        scan.close();  
	}

}
