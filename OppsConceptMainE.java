package Aug05;
import java.util.Scanner;
class Employee{
	int Eid;
	String name;
	float ESalary;
	
	//member methods
	void inputData() {
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter name, id and salary");
	      name=sc.next();
	      Eid=sc.nextInt();
	      ESalary=sc.nextFloat();
	      sc.close();
	    }
	    
	    void displayData(){
	        System.out.println("Name="+name);
	        System.out.println("Id="+Eid);
	        System.out.println("Salary="+ESalary);
	    }
	}

public class OppsConceptMainE {
	 public static void main(String[] args) {
	        System.out.println("Main method");
	        
	        
	        //Create an object of Employee class
	        
	        Employee eob=new Employee();
	        System.out.println("id="+eob.Eid);
	        System.out.println("Name="+eob.name);
	        System.out.println("Salary="+eob.ESalary);
	        
	        eob.inputData();  //invoke menthod
	        eob.displayData();
	        
	        System.out.println("Name in main method "+eob.name);	        
	    }
	}

