
package classandobj;
import java.util.Scanner;
class Areas{
	float radius;
	double area;
	Scanner sc = new Scanner(System.in);
	void radius() {
		System.out.println("Enter the radius : ");
		radius=sc.nextInt();
	}
	void area() {
		System.out.println("Radius of circle is : "+radius );
		area = 3.14*(radius*radius);
		System.out.println("Area of circle is: "+area);
	}
}
public class Type_casting {
	public static void main(String[] args) {
		Areas obj = new Areas();
		obj.radius();
		obj.area();
	}
}
