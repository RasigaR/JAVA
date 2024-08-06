package Aug05;

import java.util.Scanner;
class Student{
    int sid;
    String sname;
    float sfees;
    String semail;
    
    void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id, name,fees and Email id");
        sid=sc.nextInt();
        sname=sc.next();
        sfees = sc.nextFloat();
        semail=sc.next();
        sc.close();
    }
    
    void displayData() {
        System.out.println("name ="+sname);
        System.out.println("Id="+sid);
        System.out.println("Fees="+sfees);
        System.out.println("Email id="+semail);
    }
}
public class StudentsMain {
	 public static void main(String[] args) {
	        
//       Student s1=new Student();
//       Student s2=new Student();
//       s1.inputData();
//       s1.displayData();
//       s2.inputData();
//       s2.displayData();
       
       //array of objects
       Student s[]=new Student[2];
       for(int i=0;i<s.length;i++) {
           //Student sob=new Student();
           s[i]=new Student();
           s[i].acceptData();
           s[i].displayData();
		 }
	 }
}
