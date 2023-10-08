package kn.com.array;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		Array Declaration & Creation, Initialization
		int arr[][]= {{1,2,3,4,5},{50,60,70,80,90}};
        int brr[][]= {{50,50,50,50,50},{1,2,3,4,5}};

         findsumoftwoarrays(arr,brr);	
	}
	private static void findsumoftwoarrays(int[][] arr, int[][] brr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				int crr[][]=new int[arr.length][arr[i].length];
				crr[i][j]=arr[i][j]+brr[i][j]; 
					System.out.print(crr[i][j]+" ");
					
			}
		}
	}	
	}