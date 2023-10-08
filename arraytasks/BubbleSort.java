package com.kn.arraytasks;

public class BubbleSort {
     public int[] printBubbleSort(int []arr) {
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 boolean issorted=false;
    		 for(int j=0;j<arr.length-1-i;j++) {
    			 if(arr[j]>arr[j+1]) {
    				 arr[j]=arr[j]+arr[j+1];
    				 arr[j+1]=arr[j]-arr[j+1];
    				 arr[j]=arr[j]-arr[j+1];
    				 issorted=true;
    			 }
    		 }
    		 if(issorted==false) {
    			 System.out.println("Array After Sorted");
    			 break;
    		 }
    	 } 
		return arr; 
     }
}
