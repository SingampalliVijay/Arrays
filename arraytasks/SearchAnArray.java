package com.kn.arraytasks;

import java.util.Scanner;

public class SearchAnArray {
     public int findBinarySearch(int arr[]) {
 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the element to be search");
    	int element=scan.nextInt();
    	int low=0,high=arr.length-1,position=0;
    	int mid=0;
    	boolean isfound=false;
    	scan.close();
      while(low<=high) {
    	  mid=(low+high)/2;
      if(element==arr[mid]) {
    		isfound=true;
    		position=mid+1;
    		break;
    	  }
      if(element>arr[mid]){
    		  low=mid+1;
    	  }
      else {
    		  high=mid-1;
          }
      }
    System.out.println("<<< >>>");
          if(isfound) {
    		  System.out.println(element+" is Found In An Array "+position);
    	  }else {
    		  System.out.println("Not Found In An Array");
    	  }
		return mid;
	}
}