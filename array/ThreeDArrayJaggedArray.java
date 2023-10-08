package kn.com.array;

import java.util.Scanner;

public class ThreeDArrayJaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		Array Declaration
		int[][][] arr;
		
//		Array Creation
		arr=new int[4][][];
		
	
//		Array Initialization
		arr[0]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[4];
		arr[0][2]=new int[1];
		
		arr[1]=new int[2][3];
		
		arr[2]=new int[2][];
		arr[2][0]=new int[2];
		arr[2][1]=new int[1];
		
		arr[3]=new int[3][2];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array "+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Array "+(i+1)+"-Indexing "+(j)+" :");
				for(int k=0;k<arr[i][j].length;k++) {
//								
				arr[i][j][k]=scan.nextInt();	
				}
			}
		}
		
//		Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("Data is as follows for "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		scan.close();
	}
}
