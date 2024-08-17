package Aug08;

class ParentClass {
	public ParentClass() {
		System.out.println("Default");
	}
	public ParentClass(String name) {
		System.out.println("Name="+name);
	}
}
class Student extends ParentClass{
	int sid;
	String sname;
	Student(){
		System.out.println("Constructor with no argument");
	}
	Student(int sid, String sname){
		//this(); //in child class constructor either we can use
		          //this or super keyword
		super(sname);   //Super is user to call parent class constructor
		System.out.println("ID="+sid);
		System.out.println("Name="+sname);
	}
	void method1() {
		System.out.println("method1");
		this.method2();
	}
	void method2() {
		System.out.println("method2");
		
	}

}
public class MainApp {
	public static void main(String[] args) {
		Student s=new Student(21,"Rasiga");
		//Student s1=new Student();
		s.method1();
	}

}
