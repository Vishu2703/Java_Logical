package String;

public class StrRev {
	public static void main(String[] args) {
		String str="Vishu";
		char ch;
		String revstr="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			System.out.println(ch);
			revstr = ch+revstr;
			
		}
		System.out.println(revstr);
	}

}
