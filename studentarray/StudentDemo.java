package com.kn.studentarray;

public class StudentDemo {

	public static void main(String[] args) {
	
		Student s1=new Student(01,"Vijay",30);
		
		Student s2=new Student(02, "Ganesh",89);
		
		Student s3=new Student(03, "Ajay",66);
		
		Student[] srr=new Student[3];
		
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		
		System.out.println("Student Details :");
		for(int i=0;i<srr.length;i++) {
			System.out.println("ID ="+srr[i].id+" , Name ="+srr[i].name+" , Marks="+srr[i].marks);
		}

		System.out.println();
		System.out.println("Student Details Where Name =Ganesh");
		for(int i=0;i<srr.length;i++) {
			if(srr[i].name.equals("Ganesh")) {
			System.out.println("ID ="+srr[i].id+" , Name ="+srr[i].name+" , Marks="+srr[i].marks);
			}
		}
		
		System.out.println();
		System.out.println("Pass Marks :");
		for(int i=0;i<srr.length;i++) {
			if(srr[i].marks<35) {
				int num=35-srr[i].marks ;
				System.out.println(srr[i].name);
				System.out.println("Existing Marks ="+srr[i].marks);
				System.out.println("After Grace ");
				System.out.println("Upgraded Marks ="+(srr[i].marks+num));
			}
		}
		
		System.out.println();
		System.out.println("Sorting Marks :");
		for(int i=0;i<srr.length;i++) {
			boolean isSwapped=false;
			for(int j=0;j<srr.length-1;j++) {
				if(srr[j].marks>srr[j+1].marks) {
					Student swap=srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=swap;
				}
				isSwapped=true;
			}
			if(isSwapped==false) {
				break;
			}
		}
		
		for(int i=0;i<srr.length;i++) {
	     System.out.println(" ID ="+srr[i].id+" \n Name ="+srr[i].name+" \n Marks="+srr[i].marks);
	     System.out.println();
		}

	}

}
