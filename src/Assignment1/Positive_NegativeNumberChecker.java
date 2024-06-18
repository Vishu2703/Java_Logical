package Assignment1;
import java.util.Scanner;
/*Create a program that checks whether a given number is positive, negative, or zero.*/
public class Positive_NegativeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any integer : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("Integer is positive");
		}else if(a<0) {
			System.out.println("Number is negative");
		}else
			System.out.println("Number is zero");
	}

}
