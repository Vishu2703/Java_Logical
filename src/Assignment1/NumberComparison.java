package Assignment1;
import java.util.Scanner;
/*Develop a program that takes three numbers as input and prints out the largest of the three*/
public class NumberComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest Number is a: " +a);
		}else if(b>a && b>c) {
			System.out.println("Largest Number is b : " +b);
		}else if(c>a && c>b) {
			System.out.println("Largest Number is c: " +c);
		}else {
			System.out.println("All numbers are equal");
		}
	}

}
