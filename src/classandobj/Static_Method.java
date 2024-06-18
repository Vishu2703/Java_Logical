package classandobj;
class Static_demo{
	public void show() {
		System.out.println("Show called");
	}
	public static void  add(int a, int b) {
		int c = a+b;
		System.out.println("Sum of number is : " +c);
	}

}

public class Static_Method {
	public static void main(String[] args) {
		Static_demo obj = new Static_demo();
		obj.show();
		Static_demo.add(5,6);
	}
}
