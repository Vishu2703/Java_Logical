package abstraction;
abstract class Display{
	abstract void display();
	void show() {
		System.out.println("This is show method");
	}
}
class Show extends Display{
	void display() {
		System.out.println("This is display method");
	}
}
public class Abstractcls {
	public static void main(String[] args) {
		Display obj = new Show();
		obj.display();
		obj.show();
	}
}
