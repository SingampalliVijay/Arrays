package com.kn.arraytasks;

import java.util.Scanner;

public class SelectionSortArrayDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
  	  
  	  System.out.println("Enter Array size");
//  	  Array Declaration and Creation
  	  int []arr=new int[scan.nextInt()];
  	  
//  	  Array Initialization
  	  System.out.println("Enter Elements");
  	  for(int i=0;i<arr.length;i++) {
  		  arr[i]=scan.nextInt();
  	  }
  	  
//  Object Creation to call SelectionSortArray
  	  SelectionSortArray sort=new SelectionSortArray();
//  	  Method call
  	 sort.selectionSort(arr);
//  	 sorted array
  	 System.out.println("Sorted Array");
 	 for(int i=0;i<arr.length;i++) {
//  	 for(int i: arr) {
  		 System.out.print(arr[i]+" ");
  	 }
	}
}