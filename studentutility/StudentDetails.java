package com.kn.studentutility;

import java.util.Scanner;

public class StudentDetails {
	
	static Scanner scan = new Scanner(System.in); 
	
	public static void searchStudentonId(StudentUtility[] srr, int id) {

		for (StudentUtility s : srr) {
			if (s.id == id) {
				System.out.println("Id -" + s.id + "\nName -" + s.name + "\nMarks -" + s.marks);
			}

		}
		System.out.println();
	}

	public static void searchStudentOnName(StudentUtility[] srr, String Name) {
		for (StudentUtility s : srr) {
			if (s.name.equals(Name)) {
				System.out.println("Id -" + s.id + "\nName -" + s.name + "\nMarks -" + s.marks);
			}
		}
		System.out.println();
	}

	public static void sortingonMarks(StudentUtility[] srr) {
		for (int i = 0; i < srr.length - 1; i++) {
			// boolean isSorted = false;
			for (int j = 0; j < srr.length - 1 - i; j++) {
				if (srr[j].marks > srr[j + 1].marks) {
					// isSorted = true;
					StudentUtility temp = srr[j];
					srr[j] = srr[j + 1];
					srr[j + 1] = temp;
				}
			}
//			if (isSorted = false) {
//				break;
//			}
		}
		for (StudentUtility s : srr) {
			System.out.println("ID = " + s.id + "\tName = " + s.name + "\tMarks = " + s.marks);
		}
		System.out.println();
	}

	public static void gracemarks(StudentUtility[] srr) {
		System.out.println("Marks of Students failed :");
		for (int i = 0; i < srr.length; i++) {
			if (srr[i].marks < 35) {
				int num = 35 - srr[i].marks;
				System.out.println("Marks :" + srr[i].marks);
				System.out.println("After Adding Grace Marks");
				System.out
						.println("ID = " + srr[i].id + "\tName = " + srr[i].name + "\tMarks = " + (srr[i].marks + num));
			}
		}
		System.out.println();
	}

	public static void rateapplication(int rate) {
		
		while(rate >= 6 || rate <= 0) {
			System.out.println("Please Enter Valid number");
			rate = scan.nextInt();
		}
		if (rate < 6 && rate > 0) {
			for (int i = 0; i < rate; i++) {
				System.out.print("*");
			}
		} 
	}
}
