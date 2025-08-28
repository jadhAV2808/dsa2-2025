package arr;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,4,5,5};
		int n=arr.length;
		
		int cnt = getUnique(arr,n);
		System.out.println("uniques cnt:"+ cnt);
		
		cnt = getUnique1(arr,n);
		System.out.println("uniques cnt:"+ cnt);
		
		
		System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i] + " ");
        }
	}

	/*
	 * brute force
	 * using set
	 */
	private static int getUnique(int[] arr, int n) {
		Set<Integer> set = new HashSet<>();
		
		for(int i:arr)
			set.add(i);
		
		return set.size();
	}
	
	/*
	 * optimal
	 * 2 pointer approach
	 */
	private static int getUnique1(int[] arr, int n) {
		
		int i=0;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}
}
