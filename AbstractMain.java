package Aug08;
abstract class Bank{
	
	private double amount; 
	public Bank(double amount) {
		this.amount=amount;
		System.out.println("Abstract class");
		System.out.println("Amount="+amount);
	}
	abstract void display();
}
class MyBank extends Bank{
	public MyBank(int amount) {
		//this.amount=amount;
		super(amount);
		System.out.println("MyBank Constructor");
		
	}
	@Override
	void display() {
		System.out.println("abstract class display method");
	}
	
//	void display2() {
//			System.out.println("MyBank method");
//		}
	}

public class AbstractMain {
	public static void main(String[] args) {
		Bank obj=new MyBank(4000);
		obj.display();
//		obj.display2();
	}

}
