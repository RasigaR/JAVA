package Aug19;
class MyClass extends Thread{
	public void run() {
		System.out.println("Run method called "+Thread.currentThread());
	}
}

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Main Tread "+Thread.currentThread());
		MyClass obj=new MyClass();
		obj.start(); //thread 0
		obj.setName("First Thread");
		
		
		MyClass obj1=new MyClass();
		obj1.start(); //thread 1
		obj1.setName("Second Thread");
		//obj.start(); //can be started only once
		//obj.run();
	}

}
