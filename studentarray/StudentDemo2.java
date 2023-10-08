package com.kn.studentarray;

import java.util.Scanner;

public class StudentDemo2 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("How many Students :");
	Student []srr=new Student[scan.nextInt()];
    
	System.out.println();
	for(int i=0;i<srr.length;i++) {
		System.out.print("Enter the ID of Student-"+(i+1)+" :");
		int id =scan.nextInt();
		System.out.print("Enter the Name of Student-"+(i+1)+" :");
		String name=scan.next();
		System.out.print("Enter the Marks of Student-"+(i+1)+" :");
		int marks=scan.nextInt();
		srr[i]=new Student(id,name,marks);
	
	}
	for(Student s: srr) {
		System.out.println(" ID ="+s.id+" \n Name ="+s.name+" \n Marks="+s.marks);
		System.out.println();
	}
	
	System.out.print("Search of an id No :");
	int element=scan.nextInt();
	int low=0,high=srr.length-1; int position =-1;
	int mid=0; boolean isfound=false;
	while(low<high) {
		mid=(low+high)/2;
		if(element==srr[mid].id) {
			isfound=true;
			position=mid+1;
			break;
		}
		if(element>mid) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	if(isfound) {
		System.out.println("Id "+element+" is found in position "+position);
		System.out.println(" ID ="+srr[position-1].id+" \n Name ="+srr[position-1].name+" \n Marks="+srr[position-1].marks);
	}
	}
}
