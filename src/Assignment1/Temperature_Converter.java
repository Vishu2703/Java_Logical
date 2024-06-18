package Assignment1;
import java.util.Scanner;
/*Write a program that converts temperatures between Fahrenheit and Celsius. The program should prompt the user to choose the conversion type and then input the temperature to convert.*/
public class Temperature_Converter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int Temp = sc.nextInt();
		
		int Convert;
		System.out.println("Select 1 to convert celsius to Fahrenheit");
		System.out.println("Select 2 to convert Fahrenheit to celsius");
		int Type = sc.nextInt();
		if(Type == 1) {
			Convert = (Temp * 9/5) + 32;
			System.out.println("Conversion of celsius to Fahrenheit is : " +Convert);
		}else {
			Convert = (Temp - 32) * 5/9;
			System.out.println("Conversion of Fahrenheit to celsius is : " +Convert);
		}
		
	}
}
