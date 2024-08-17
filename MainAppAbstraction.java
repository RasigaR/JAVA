package Aug07;
abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{
	@Override
	void area() {
		int l=4,b=8;
		int area =l*b;
		System.out.println("Area of Rectangle=" +area);
	}
}

public class MainAppAbstraction {
	public static void main(String[] args) {
		Rectangle ob=new Rectangle();
		
		ob.area();
	}

}
