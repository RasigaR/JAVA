package Au13;
import java.util.ArrayList;
import java.util.Iterator;
class Student{
    private int sid;
    private String sname;
    private float sfees;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(int sid, String sname, float sfees) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sfees = sfees;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public float getSfees() {
        return sfees;
    }
    public void setSfees(float sfees) {
        this.sfees = sfees;
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
    }
    
    
}

public class CollectionUserDefinedObject {
	 public static void main(String[] args) {
	        ArrayList<Student> slist = new ArrayList<Student>();
	        Student s1 = new Student(1,"Reka",8765.34f);
	        Student s2 = new Student(2,"Neha",5432.24f);
	        Student s3 = new Student(3,"Akash",15432.24f);
	        
	        slist.add(s1);
	        slist.add(s2);
	        slist.add(s3);
	        
	        //System.out.println(slist);
	        
	        //using Iterator
	        Iterator<Student> iobjst=slist.iterator();
	        System.out.println("ID\tName\tFees");
	        while(iobjst.hasNext()) {
	        Student s=iobjst.next();
	        //System.out.println(s);
	        System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
	        }
	        
	        
	    }

}
