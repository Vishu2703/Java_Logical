package classandobj;

import java.util.Scanner;

//Create a class in java except number from user and check it is odd or even
class Number{
	Scanner sc = new Scanner(System.in);
	
	
	
	public void show() {
		System.out.println("Enter any number : ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
public class EvenOdd {
	public static void main(String[] arg) {
		Number obj = new Number();
		obj.show();
	}

}
