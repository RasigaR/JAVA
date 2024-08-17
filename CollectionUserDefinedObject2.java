package Au13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee {
    private int eid;
    private String ename;
    private double esalary;

    public Employee() {
        super();
    }

    public Employee(int eid, String ename, double esalary) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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
        return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
    }
}



public class CollectionUserDefinedObject2 {
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
        
        

        // using Iterator
        Iterator<Employee> iobjemp = elist.iterator();
        System.out.println("ID\tName\tSalary");
        while (iobjemp.hasNext()) {
            Employee e = iobjemp.next();
            System.out.println(e.getEid() + "\t" + e.getEname() + "\t" + e.getEsalary());
        }
      
        }
    }

