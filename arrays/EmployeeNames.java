package com.kn.arrays;

import java.util.Scanner;

public class EmployeeNames {

	String name;
	int age;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeNames[] arr = new EmployeeNames[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new EmployeeNames();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Employee :"+(i+1));
			arr[i].name = scan.next();
			arr[i].age = scan.nextInt();
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println("Employee "+(i+1));
		System.out.println(arr[i].name);
		System.out.println(arr[i].age);
	  }
	}
}
