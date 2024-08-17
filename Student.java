package Aug07;

public class Student {
	  private int sid; 
	  public String sname; 
	  protected String email; 
	  float fees; 
	  
	 public Student(){
	    sid=1;
	    sname="Manoj";
	    email="manoj@gmail.com";
	    fees=9871.34f;
	  }
	  	 public void display() {
	      System.out.println("id="+sid);
	      System.out.println("name ="+sname);
	      
	    }
}
