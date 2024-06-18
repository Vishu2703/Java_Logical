package abstraction;
interface Area{
	//public double circle(int radius);
	public double area(int len, int bred);
}
class Triangle implements Area{
	
	public double area(int len, int bred) {
		return (0.5*len * bred);
	}
}

class Rectangle implements Area{
	
	public double area(int len, int bred) {
		return (len * bred);
	}
}
public class Interface {
	public static void main(String[] args) {
		
		Rectangle x=new Rectangle();
		double rect_are=x.area(4, 3);
		 System.out.println(rect_are);
		
	}
}
