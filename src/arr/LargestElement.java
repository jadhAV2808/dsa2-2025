package arr;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {3,5,2,1,3,6};
		int n=arr.length;
		
		int largest = findLargest(arr);
		System.out.println("largesr:"+ largest);
		
		
		largest = findLargest(arr, n);
		System.out.println("largesr:"+ largest);
	}

	
	/*
	 * brute 
	 * sort an arr and return last element
	 * 
	 * tc:O(nlogn)
	 * sc:O(1)
	 */
	private static int findLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	/*
	 * optimal
	 * 
	 * tc:O(n)
	 */
	private static int findLargest(int[] arr, int n) {
		int largest = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}
	
	
}
