package Assignment1;
import java.util.Scanner;
/*Create a program that converts time given in seconds into hours, minutes, and seconds.*/
public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter time in second : ");
		int second = sc.nextInt();
		int hour;
		int min;
		hour = second/60;
		min = second%60;
		System.out.println("Time is "+hour +":" +min);
	}

}
