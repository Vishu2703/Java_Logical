package Assignment1;

import java.util.Scanner;

/*Create a program that checks if a given year is a leap year or not. A leap year is divisible by 4 but not divisible by 100 unless it is also divisible by 400.*/
public class Leap_Year_Checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		int Year = sc.nextInt();
		if(Year%4==0) {
			System.out.println("This is a leap year");
		}else
			System.out.println("This is not a leap year");
	}
}
