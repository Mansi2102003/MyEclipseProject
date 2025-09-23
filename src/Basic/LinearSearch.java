package Basic;

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
		
	}

}
