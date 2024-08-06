package july29;
import java.util.Scanner;
public class Grademarks{
public static void main(String[] args){
int marks;
Scanner sc=new Scanner (System.in);
marks=sc.nextInt();
if(marks>=90 && marks<=100){
System.out.println("your grade is A");
}
else if(marks>=70 && marks<=89){
System.out.println("your grade is B");
}
else if(marks>=50 && marks<=69) {
System.out.println("Your grade is C");
}
else if(marks>=35 && marks<=49) {
System.out.println("Your grade is D");
}
else if(marks>=34 && marks<=00){
System.out.println("Your grade is E");          
}
else {
System.out.println("Invalid marks");
}
sc.close();
}

}

