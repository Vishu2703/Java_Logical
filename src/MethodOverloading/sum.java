package MethodOverloading;
class Method{
	void sum(int a, int b) {
		System.out.println("Sum of number "+(a+b));
	}
	void sum (int a, int b, int c) {
		System.out.println("Sum of number "+(a+b+c));
	}
	void sum(int a,int b, int c, int d) {
		System.out.println("Sum of number "+(a+b+c+d));
	}
}
public class sum {
	public static void main(String[] args) {
		Method obj = new Method();
		obj.sum(1, 2);
		obj.sum(1, 2, 3);
		obj.sum(1,2,3,4 );
	}
}
