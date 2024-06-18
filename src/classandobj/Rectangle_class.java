//Crate a rectangle class with attributes for length and width. Write methods to set
//and get these attributes, calculate the area, and display the rectangle's information.
package classandobj;
class value{
	int Length;
	int Width;
	double area;
	void values(int a, int b) {
		Length=a;
		Width=b;
	}
	void area_display(){
		area=Length*Width;
		
	}
	
}

public class Rectangle_class {
	public static void main(String[] args) {
		value obj = new value();
		obj.values(7, 8);
		obj.area_display();
		System.out.println("Area of rectangle: " +obj.area);
		
	}
}

