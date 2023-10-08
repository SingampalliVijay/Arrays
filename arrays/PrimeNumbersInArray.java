//WAJP to print prime numbers in an Array
package com.kn.arrays;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
	
		int arr[]= {21,23,29,2,5,7,11,45,56,87};
		
		System.out.println("Prime Numbers In An Array");
       for(int i=0;i<arr.length;i++) {
    	   boolean isprime =true;
    	   for(int j=2;j<i;j++) {
    		   if(i%j==0) {
        		   isprime=false;
        		   break;
        	   } 
    	   }
    	   if(isprime) {
    		   System.out.println(arr[i]);
    	   }
   
       }
	}
}
