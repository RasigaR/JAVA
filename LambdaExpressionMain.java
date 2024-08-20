package Aug17;

@FunctionalInterface //a interface which has single abstract method
interface MyInt{
   void add();  //no arg no return type
   default void display() {
	   System.out.println("Default method");
   }
   
   static void methodstatic() {
	   System.out.println("Static method");
   }
  
}

interface MyInt1{
	   void add(int i, int j);  //no arg no return type
	  
	}

interface MyInt2{
	   int add(int i, int j);  //no arg no return type
	  
	}
@FunctionalInterface
interface Subtract{
    void sub();
}


@FunctionalInterface
interface Subtract1{
    void sub(int i,int j);
}


@FunctionalInterface
interface Subtract2{
    int sub(int i,int j);
}


@FunctionalInterface
interface Multiply{
    void mult();
}

@FunctionalInterface
interface Multiply1{
    void mult(int i,int j);
}

@FunctionalInterface
interface Multiply2{
    int mult(int i,int j);
}


@FunctionalInterface //a interface which has single abstract method
interface Rasi{
   void rasi(int i,int j);  //no arg no return type
   default void display2() {
	   System.out.println("Default method");
   }
   
   static void methodstatic2() {
	   System.out.println("Static method");
   }
  
}

//class Product implements MyInt{
//
//    @Override
//    public void add() {
//        System.out.println("Add method");
//        
//    }
//    
//}
public class LambdaExpressionMain {
    public static void main(String[] args) {
//        Product pob=new Product();
//        pob.add();
        
        //using annanymous class
        
        MyInt mob=()-> {
                System.out.println("Add method");
                
            };
      mob.add();
      mob.display();   //default method
      MyInt.methodstatic(); //static method
      
      
      MyInt1 mob1=(i,j)->{
    	  int s;
    	  s=i+j;
    	  System.out.println("Lambda expression with arg no return type");
    	  System.out.println("Sum="+s);
      };
      mob1.add(8, 3);
      
      MyInt1 mob2=(i,j)->System.out.println("Sum="+(i+j));
      mob2.add(4, 9);
      
      //function with arg and withreturn type
      
      MyInt2 mob3=(i,j)->{
    	  return(i+j);
      };
      
      System.out.println("Sum of 2 numbers="+mob3.add(4,7));
     
      //----------------------------------------------------------------------------------------------------------------------------------
      
      
      Subtract sob1=()-> {
          System.out.println("Subtract method");
          
      };
      sob1.sub();
      
      Subtract1 sob2=(i,j)->{
    	  int s;
    	  s=i-j;
    	  System.out.println("Lambda expression with arg no return type");
    	  System.out.println("Sub="+s);
      };
      sob2.sub(8, 3);
      
      Subtract1 sob3=(i,j)-> {
          System.out.println("Sub="+(i-j));
          
      };
      sob3.sub(5,2);
      
      
     Subtract2 sob4=(i,j)->{
    	  return(i-j);
      };
      
      System.out.println("Sub="+sob4.sub(10,4));
     

       //-------------------------------------------------------------------------------------------------------------------------------
      
      Multiply ob1=()-> {
          System.out.println("Multiply method");
          
      };
      ob1.mult();
      
      
      Multiply1 ob2=(i,j)->{
    	  int s;
    	  s=i*j;
    	  System.out.println("Lambda expression with arg no return type");
    	  System.out.println("Product="+s);
      };
      ob2.mult(8, 3);
      
      Multiply1 ob3=(i,j)-> {
          System.out.println("Product="+(i*j));
          
      };
      ob3.mult(5,2);
      
      
     Multiply2 ob4=(i,j)->{
    	  return(i*j);
      };
      
      System.out.println("Product="+ob4.mult(10,4));
 
        //-------------------------------------------------------------------------------------------------------------------------------
      
      Rasi rob1=(i,j)->{
    	  System.out.println("Add="+(i+j));
      };
      rob1.rasi(10, 3);
      rob1.display2();   //default method
      Rasi.methodstatic2();
        
        //()->
        
        
    }
}