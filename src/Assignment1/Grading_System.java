package Assignment1;
/*Write a program that takes a student's score as input and prints out their grade based on the
following criteria: A for scores 90 and above, B for scores between 80 and 89, C for scores between 70 and 79, D for scores between 60 and 69, and F for scores below 60.
*/
import java.util.Scanner;
public class Grading_System {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student : ");
		String name = sc.nextLine();
		System.out.println("Enter Students Roll Percentage : ");
		int Score = sc.nextInt();
		if(Score>=90) {
			System.out.println("Student is pass with A Grade ");
		}else if(Score>=80) {
			System.out.println("Student is pass with B Grade ");
		}else if(Score>=70) {
			System.out.println("Student is pass with C Grade");
		}else if(Score>=60) {
			System.out.println("Student is pass with D Grade");
		}else if(Score<60) {
			System.out.println("Student is fail in Examination");
		}else {
			System.out.println("Enter a valid percentage");
		}
	}

}
