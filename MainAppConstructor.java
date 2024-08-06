package Aug05;

public class MainAppConstructor {
	 int num;
	    public MainAppConstructor(){ //name of the constructor is same as class name
	                                 //no return type, implicit return type is class type
	                                 //used to initialize data
	                                 //constructor is called on creation of an object
	                                 
	        num=5;
	        System.out.println("Constructor");
	    }
	    void tejalmethod1() {
	        System.out.println("Method");
	    }
	    public static void main(String[] args) {
	        
	        MainAppConstructor ob=new MainAppConstructor(); //implicit calling
	        ob.tejalmethod1(); //method calling , explicit
	    }
	}


