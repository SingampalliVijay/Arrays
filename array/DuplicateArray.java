package kn.com.array;

public class DuplicateArray {

	public static void main(String[] args) {
//		Array Declaration & Creation
    int arr[]= {23,73,86,23,24};
	int num = 0;
//	Array Initialization
	for(int i=0;i<arr.length;i++) {
	 for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
		 num=j;
			break;
		}
	 }
	}
	 System.out.println("The duplicate value is "+arr[num]);
	}
}
