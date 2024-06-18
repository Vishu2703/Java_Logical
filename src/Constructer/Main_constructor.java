package Constructer;
class demo{
	void display() {
		System.out.println("I am display");
	}
	demo(){
		System.out.println("I am constructor");
	}
}
public class Main_constructor {
	public static void main(String[] args) {
		demo obj = new demo();
	}
}
