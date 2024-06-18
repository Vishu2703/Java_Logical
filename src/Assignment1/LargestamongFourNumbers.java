package Assignment1;
import java.util.Scanner;
/*Write a program that takes four numbers as input and prints out the largest among them.*/
public class LargestamongFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println("Largest number is : " +a);
		}else if(b>a && b>c && b>d) {
			System.out.println("Largest number is : " +b);
		}else if(c>a && c>b && c>d) {
			System.out.println("Largest number is : " +c);
		}else if(d>a && d>b && d>c) {
			System.out.println("Largest number is : " +d);
		}else
			System.out.println("All numbers are equal");
	}

}
