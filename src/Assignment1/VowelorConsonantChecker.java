package Assignment1;
import java.util.Scanner;
/*Write a program that checks whether a given character is a vowel or a consonant.*/
public class VowelorConsonantChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		switch (ch) {
        case 'a':
        	System.out.println(ch + " is a vowel");
            break;
        case 'e':
        	System.out.println(ch + " is a vowel");
            break;
        case 'i':
        	System.out.println(ch + " is a vowel");
            break;
        case 'o':
        	System.out.println(ch + " is a vowel");
            break;
        case 'u':
            System.out.println(ch + " is a vowel");
            break;
        default:
            System.out.println(ch + " is a consonant");
    }
		
	}

}
