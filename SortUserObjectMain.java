package Aug14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private int Eid;
    private String ename;
    private double esalary;

    public Employee() {
        super();
    }

    public Employee(int Eid, String ename, double esalary) {
        super();
        this.Eid = Eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        this.Eid = eid;  // Corrected the parameter name here
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + Eid + ", ename=" + ename + ", esalary=" + esalary + "]";
    }
}

              //sort by using id


class SortByEid implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getEid() < e2.getEid())
            return -1;
        else if (e1.getEid() > e2.getEid())
            return 1;
        else
            return 0;
    }
}


               //sort by using salary


class SortByEsalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
    	 if (e1.getEsalary() < e2.getEsalary())
             return -1;
         else if (e1.getEsalary() > e2.getEsalary())
             return 1;
         else
             return 0;
    }
}

             //Sort by name

class SortByname implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEname().compareTo(e2.getEname());
        
    }
}
public class SortUserObjectMain {
	public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<Employee>();
        Employee e1 = new Employee(1, "Rasi", 50000);
        Employee e2 = new Employee(2, "Priya", 62000);
        Employee e3 = new Employee(6, "Nivi", 48000);
        Employee e4 = new Employee(5, "Sharmi", 58000);
        Employee e5 = new Employee(4, "Sandy", 46000);
        Employee e6 = new Employee(3, "Jesi", 52000);

        elist.add(e1);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        elist.add(e5);
        elist.add(e6);
        
        
        //sort by using id
        
        System.out.println("Before sort by Id:");
        for (Employee e : elist) {
            System.out.println(e);
        }
        SortByEid ert = new SortByEid();
        Collections.sort(elist, ert);
        System.out.println("After sort by Id:");
        for (Employee e : elist) {
            System.out.println(e);
    }
        
        //sort by using salary
        
        System.out.println("Before sort by salary:");
        for (Employee e : elist) {
            System.out.println(e);
        }
        SortByEsalary sortBySalary = new SortByEsalary();
        Collections.sort(elist, sortBySalary);

        System.out.println("After sort by salary:");
        for (Employee e : elist) {
            System.out.println(e);
        }      
        
        //sort by name
        System.out.println("Before sort by name:");
        for (Employee e : elist) {
            System.out.println(e);
        }
        SortByname sortByName = new SortByname();
        Collections.sort(elist, sortByName);

        System.out.println("After sort by name:");
        for (Employee e : elist) {
            System.out.println(e);
        }
	}
}




