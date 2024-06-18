package com.Scanner;

import java.util.Scanner;

public class multiply {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		int c = b;
		int ans = 0;
		while(b!=0) {
			ans=a+ans;
			b--;
			
		}
		System.out.println(a+"*"+c+"="+ans);
	}

}
//multiplication of matrix
//trasforment of matrix
//Sorting of array
