//Initialize object to the method
package classandobj;

class Students{
	int Roll_no;
	String Name;
	double Marks;
	void input(int Stu_Roll_no , String Stu_Name , Double Stu_Marks) {
		Roll_no=Stu_Roll_no;
		Name=Stu_Name;
		Marks=Stu_Marks;
	}
	void output() {
		System.out.println("Roll number " +Roll_no);
		System.out.println("Name " +Name);
		System.out.println("Marks " +Marks);
	}
}

public class Function {
	public static void main(String args[]) {
		Students obj = new Students();
		obj.input(3,"Vishu",70.00);
		obj.output();
	}

}
