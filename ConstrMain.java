package Aug06;
class Student{
    //instance
    private int sid;//0  //default
    private String sname;//null
    
    public Student() {
        super();
    }
    public Student(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }
    
 
public void display() {
        //System.out.println("sid="+sid);
        System.out.println("sname="+sname);
        System.out.println("this "+this);
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + "]";
  }
}
public class ConstrMain {
	public static void main(String[] args) {
		   Student sob = new Student();
	        Student sob1 = new Student(12,"Rasiga"); //constructor with argument
	         sob1.display();
	    //    sob1.display();
	      //  System.out.println(sob);
	      //  System.out.println(sob1);
	       // System.out.println("sid ="+sob.sid);
	        
	       
	    }
	
	}





