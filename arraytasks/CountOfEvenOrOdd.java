package com.kn.arraytasks;

public class CountOfEvenOrOdd {
    public void countEvenOrOddOfElements(int []arr) {
    	int Counteven=0, Countodd=0;
    	for(int i=0;i<arr.length;i++) {
    		if(i%2==0) {
    			Counteven++;
    		}else {
    			Countodd++;
    		}
    	}
    	System.out.println("Count of Even Elements in an Array : "+Counteven);
    	System.out.println("Count of Odd Elements in an Array :"+Countodd);
    }
}
