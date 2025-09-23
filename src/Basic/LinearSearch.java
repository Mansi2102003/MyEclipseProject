package Basic;

import java.util.Scanner;

public class LinearSearch {
	public static int linear_Search(int[]arr, int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]== key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Element which you want to search: ");
		int key = sc.nextInt();
		
		int result = linear_Search(arr, key);
		
		if(result!=-1) {
			System.out.println("Element present at Index: "+result);
		}else {
			System.out.println("Element not present in Array");
		}
		
	}

}
