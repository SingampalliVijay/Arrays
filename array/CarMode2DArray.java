package kn.com.array;

import java.util.Scanner;

public class CarMode2DArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Here is the No.of Car Companies");
//  Array Declaration
	String [][]arr=new String[scan.nextInt()][];
//	Array Creation
	System.out.println("Enter No.of Models for each company ");
	for(int i=0;i<arr.length;i++) {
	arr[i]=new String[scan.nextInt()];
	}
//	Array initialization
	System.out.println(" ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(" <<<   >>>");
		String name=scan.next();
		System.out.println("These are Models of car "+name+":");
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=scan.next();
		}
	}
	
//  Array Traversing
	for(int i=0;i<arr.length;i++) {
		System.out.println("Company"+(i+1)+" :");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Model "+(j+1)+": "+arr[i][j]);
//			System.out.println(arr[i][j]);
	}
	}
	scan.close();
	}
}


/*
 * Brand Name:>>>Tata
Model 1: Nexon
Model 2: Taigo
Model 3: Safari
Model 4: Altroz
Brand Name:>>>Mahindra
Model 1: Thar
Model 2: Bolero
Model 3: XUV700
Brand Name:>Hyundai
Model 1: Tucson
Model 2: Creta
Model 3: Verna
Brand Name:>>>Suzuki
Model 1: Swift
Model 2: Bolero
Model 3: Alto
Model 4: Ertiga
 */






























