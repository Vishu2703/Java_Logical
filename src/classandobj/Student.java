//Initialize object to the class
package classandobj;
class Stu_detail{
	int Roll_no;
	String Name;
}
public class Student {
	public static void main(String args[]) {
		Stu_detail x = new Stu_detail();
		x.Roll_no = 1;
		x.Name ="Vishu";
		System.out.println("Roll number is " +x.Roll_no);
		System.out.println("Name is " +x.Name);
	}
}
