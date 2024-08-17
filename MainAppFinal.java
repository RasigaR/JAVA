package Aug07;
class Employee{
	void display() {
		System.out.println("Employee display");
	}
	final void salaryDisplay() {
		System.out.println("Employee salaryDisplay");
	}
}

class Hr extends Employee{
	void display() {
		System.out.println("HR display");
	}
}

public class MainAppFinal {
	 final int employeeId = 12345; 

	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        Hr hr = new Hr();
	        
	        emp.display(); 
	        emp.salaryDisplay(); 
	        
	        hr.display(); 
	        hr.salaryDisplay(); 
	        
	        MainAppFinal app = new MainAppFinal();
	        System.out.println("Employee ID: " + app.employeeId);
	    }

}
