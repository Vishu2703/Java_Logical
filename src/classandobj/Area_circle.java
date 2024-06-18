package classandobj;
class Area{
	float radius;
	double area;
	void radius(float r) {
		radius=r;
	}
	void area() {
		System.out.println("Radius of circle is : "+radius );
		area = 3.14*(radius*radius);
		System.out.println("Area of circle is: "+area);
	}
}
public class Area_circle {
	public static void main(String[] args) {
		Area obj = new Area();
		obj.radius(8);
		obj.area();
	}
}
