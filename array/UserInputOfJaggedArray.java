package kn.com.array;

import java.util.Scanner;

public class UserInputOfJaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base size of an Array");
//	Array Declaration & Creation
		int arr[][][]=new int[scan.nextInt()][][];
//  Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array-"+(i+1));
			arr[i]=new int[scan.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Indexing-"+j);
			arr[i][j]=new int[scan.nextInt()];
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the element "+(k+1));
				arr[i][j][k]=scan.nextInt();	
				}
			}
		}
//		Array Traversing
		System.out.println("Data as Follows");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println(arr[i][j][k]);
				}
			}
		}
		scan.close();
	}
}