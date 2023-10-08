package com.kn.arraytasks;

public class InsertionSortArray {
      public int[] printinsertionSort(int []arr) {
    	  for(int i=1;i<arr.length;i++) {
    		int temp=arr[i];
    		  for(int j=i-1;j>=0;j--) {
    			  while(temp<arr[j]) {
    				  arr[j+1]=arr[j];
    				  arr[j]=temp;
    			  }
    		  }
    	  }
		return arr;
      }
}
