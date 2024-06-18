package Array;

public class MaxArray {
	public static void main(String args[]) {
		int arr[] = {22,1,2,3,4,43,5,6,7,8,9,20};
		int max = arr[0];
		for(int a:arr) {
			if(max<a) {
				max = a;
			}
		}
		System.out.println(max);
	}

}
