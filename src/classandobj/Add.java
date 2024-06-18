package classandobj;
class Numbers{
	public void show() {
		System.out.println("Show called");
	}
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Sum of number is : " +c);
	}
}

public class Add {
	public static void main(String[] args) {
		Numbers obj = new Numbers();
		obj.show();
		obj.add(6, 7);
	}

}
