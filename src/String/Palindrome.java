package String;
public class Palindrome {
	public static void main(String[] args) {
		String str="naman";
		
		char ch;
		String revstr="";
		int a=0;
		int b=1;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);			
			revstr = ch+revstr;			
		}
		System.out.println(revstr);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==revstr.charAt(i)) {
				a=1;
			}
			else
				b=0;
		}
		if(a==1&&b==1) {
			System.out.println("This is palindrome");
		}else
			System.out.println("This is not palindrome");
	}
}
