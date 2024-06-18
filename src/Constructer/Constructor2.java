package Constructer;
class demo1{
	int x;
	int y;
	demo1(){
		x=5;
		y=6;
	}
	void display() {
		System.out.println("The value of x = "+x);
		System.out.println("The value of y = "+y);
	}
}

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		demo1 obj = new demo1();
		obj.display();

	}

}
