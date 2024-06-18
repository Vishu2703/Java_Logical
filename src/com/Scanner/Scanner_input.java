package com.Scanner;
import java.util.Scanner;
public class Scanner_input {
	public static void main(String args[]) {
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = myObj.nextLine();
		System.out.println("Enter age : ");
		int age = myObj.nextInt();
		System.out.println("Enter Salary : ");
		double salary = myObj.nextDouble();
	}

}
