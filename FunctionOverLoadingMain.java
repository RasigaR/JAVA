//Function overloading is compiletime polymorphisam(many forms)
//Function overloading can be achieved
//1.Based on Data type
//2.Based on number of arguments
//3.By interchanging the arguments
//*note: We cannot overload the function based on return type
package Aug05;
class Overload{
    void display() {
        System.out.println("function with no argument");
    }
   void display(int i) {
        System.out.println("function with one int arg");
    }
   void display(float f) {
        System.out.println("function with one float arg");
    }
   
   void display(int i, int j) {
       System.out.println("two argument of int type");
   }
   void display(int i, float j) {
       System.out.println("two argument of int and float type");
   }
   void display(float i, int j) {
       System.out.println("two argument of float  and int type");
   }
}

public class FunctionOverLoadingMain {
	  public static void main(String[] args) {
	        Overload obj = new Overload();
	        obj.display(); 
	        obj.display(4);
	        obj.display(5,8.6f);
	        obj.display(7.8f,45);

}
}