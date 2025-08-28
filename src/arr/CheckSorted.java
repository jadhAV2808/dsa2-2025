package arr;

public class CheckSorted {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3};
		int n=arr.length;
		
		boolean isSorted = isSorted(arr,n);
		System.out.println(isSorted);
	}

	private static boolean isSorted(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}
}
