package Aug06;
class Parent{
    int n1;
    int n2;
    public Parent() {
    	super();
    	System.out.println("Parent constructor");
    }
}
class Child extends Parent{ //Child class can access all data except private
     int s;
     public Child() {
    	 super();
    	 System.out.println("Child constructor");
     }
    void add(){
         n1=10;
         n2=20;
        s=n1+n2;
        System.out.println("sum="+s);
   }
}
class Child2 extends Child{
	public Child2() {
		//super();
		System.out.println("Child2 constructor");
		}
	void display(){
		System.out.println(n1);
	}
}

public class MainAppInheritence {
	public static void main(String args[]){ 
        Child2 cobj = new Child2();
        //cobj.add();
        cobj.display();
	}

}
