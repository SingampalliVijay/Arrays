package kn.com.array;

import java.util.Scanner;

public class SumofTwoArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
//	Array Declaration & Creation
	System.out.println("Enter Arr Data");
	int arr[][]= new int[scan.nextInt()][scan.nextInt()];
	System.out.println("Enter Brr Data");
	int brr[][]=new int[scan.nextInt()][scan.nextInt()];
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Array"+(i+1)+" : ");
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	
	for(int i=0;i<brr.length;i++) {
		System.out.println("Enter 2Array "+(i+1)+" :");
		for(int j=0;j<brr[i].length;j++) {
		brr[i][j]=scan.nextInt();	
		}
	}

     findsumoftwoarrays(arr,brr);
     scan.close();
}
private static void findsumoftwoarrays(int[][] arr, int[][] brr) {
	System.out.println("Enter Crr Data: ");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++){
			int crr[][]=new int[arr.length][arr[i].length];
			crr[i][j]=arr[i][j]+brr[i][j];
				System.out.print(crr[i][j]+" ");	
		}
	}
	}
}

/*
 * Enter Arr Data
2
3
Enter Brr Data
2
3
Enter Array1 : 
12
23
34
Enter Array2 : 
45
56
67
Enter 2Array 1 :
8
7
6
Enter 2Array 2 :
8
7
6
Enter Crr Data: 
20 30 40 53 63 73 */
