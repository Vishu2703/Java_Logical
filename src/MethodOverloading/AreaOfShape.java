package MethodOverloading;
class Shape{
	double Area;
	void Area(float l, float b) {
		Area = l*b;
		System.out.println("Area of Rectangle is " +Area);
	}
	void Area(int s) {
		Area = s*s;
		System.out.println("Area of Square is " +Area);
	}
	void Area(double r) {
		Area = 3.14*r*r;
		System.out.println("Area of Circle is " +Area);
	}
}
public class AreaOfShape {
	public static void main(String[] args) {
		Shape obj = new Shape();
		obj.Area(5,6);
		obj.Area(7.1);
		obj.Area(7);
	}
}
