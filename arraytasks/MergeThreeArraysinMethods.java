package com.kn.arraytasks;

public class MergeThreeArraysinMethods {
	public int[] printMergeArrays(int[]arr,int[]brr,int[]crr) {
		int[] drr=new int[arr.length+brr.length+crr.length];
    	  for(int i=0;i<arr.length;i++) {
    		  drr[i]=arr[i];
    	  }
    	  for(int i=0;i<brr.length;i++) {
    		  drr[arr.length+i]=brr[i];
    	  }
    	  for(int i=0;i<crr.length;i++) {
    		  drr[arr.length+brr.length+i]=crr[i];
    	  }
    	  System.out.println("The Marged Array Elements are ");
    	  for(int i=0;i<drr.length;i++) {
    		  System.out.println(drr[i]);
    	  }
		return drr;	  
      }
}
