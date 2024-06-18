//Develop a java program to search specific element in array of interger.Provide feeback indicating whether the element prent or not
package Array;

public class FindElement {
	public static void main(String args[]) {
		int arr[] = {11,1,12,13,3,14,4,15,5,16,6,17,7,18,8,19,9,20,10};
		int search = 5;
		int v = 0;
		for(int a:arr) {
			if(a == search) {
				v=1;
				break;
			}	
		}
		if(v==1) {
			System.out.println("Number Found");
		}else
			System.out.println("Number not Found");
	}
}

