package com.kn.studentutility;

import java.util.Scanner;

public class StudentUtlityDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many Students");
		StudentUtility[] srr = new StudentUtility[scan.nextInt()];

		for (int i = 0; i < srr.length; i++) {
			System.out.print("Student " + (i + 1) + " id :");
			int id = scan.nextInt();
			System.out.print("Student " + (i + 1) + " name :");
			String name = scan.next();
			System.out.print("Student " + (i + 1) + " marks :");
			int marks = scan.nextInt();
			srr[i] = new StudentUtility(id, name, marks);
		}
		
		System.out.println("choose any option");
		System.out.println("1. Search student details by Id...");
		System.out.println("2. Search student details by Name...");
		System.out.println("3. Sort student details by Marks in Ascending order...");
		System.out.println("4. Apply Grace Marks");
		int opt = scan.nextInt();
		switch (opt) {
		case 1:
		//System.out.println("-----");
		System.out.print("Enter Id Number to Check :");
		int id = scan.nextInt();
		StudentDetails.searchStudentonId(srr, id);
		break;
		
		case 2:
		//System.out.println("=====");
		System.out.println("Enter Name to Check :");
		String Name = scan.next();
		StudentDetails.searchStudentOnName(srr, Name);
		break;

		case 3:
		//System.out.println("****");
		System.out.println("Sorted in Ascending marks ");
		StudentDetails.sortingonMarks(srr);
		break;

		case 4:
		//System.out.println("____");
		StudentDetails.gracemarks(srr);
		break;
		
		}
		
		System.out.println("\n*************\n");
		System.out.print("Enter rating from 1 to 5 = ");
		int rate = scan.nextInt();
		StudentDetails.rateapplication(rate);

		scan.close();
	}

}
