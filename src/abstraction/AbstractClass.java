package abstraction;
abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changegear() {
		System.out.println("gear change");
	}
}
class Honga extends Bike{
	void run(){
		System.out.println("running safely");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Bike obj = new Honga();
		obj.run();
		obj.changegear();
	}

}
