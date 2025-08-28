package arr;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,6,3,6,};
		int n=arr.length;
		
		int secLargest = findSecondLargest(arr,n);
		System.out.println("sec: "+ secLargest);
		
		secLargest = findSecondLargest1(arr,n);
		System.out.println("sec: "+ secLargest);
		
		secLargest = findSecondLargest2(arr,n);
		System.out.println("sec: "+ secLargest);
	}

	/*
	 * brute
	 * 
	 * tc: O(n logn)+ N
	 */
	private static int findSecondLargest(int[] arr, int n) {
		
		Arrays.sort(arr);
		int largest = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=largest)
				return arr[i];
		}
		return -1;
	}
	
	
	/*
	 * better
	 * find largest
	 * sec=-1;
	 * find sec largest
	 * 
	 * tc: O(2N)
	 */
	private static int findSecondLargest1(int[] arr, int n) {
		int largest =arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		
		int secLargest =-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>secLargest && arr[i]!=largest)
				secLargest=arr[i];
		}
		return secLargest;
	}
		
		
	/*
	 * optimal
	 */
	private static int findSecondLargest2(int[] arr, int n) {
		int largest =arr[0];
		int secLargest =-1;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]<largest && arr[i]>secLargest)	
				secLargest=arr[i];
		}
		return secLargest;
	}
	
	
}
