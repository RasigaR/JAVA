package july29;
import java.util.Scanner;
public class CalculatorMain {
	 public static void main(String[] args) {
	        int n1,n2,ans;
	        int choice;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Calculator Menu");
	        System.out.println("1.Addition");
	        System.out.println("2.Subtraction");
	        System.out.println("3.Multiplication");
	        System.out.println("4.Division");
	        
	        System.out.println("Enter your choice");
	        choice = sc.nextInt();
	        
	        System.out.println("Enter two numbers");
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();
	        
	        switch(choice) {
	        case 1: ans = n1+n2;
	                System.out.println("The sum of "+n1+" and "+n2+" is "+ans);
	                break;
	        case 2: ans = n1-n2;
	                System.out.println("The difference of "+n1+" and "+n2+" is "+ans);
	                break; 
	        
	        case 3: ans = n1*n2;
	                System.out.println("The product of "+n1+" and "+n2+" is "+ans);
	                break;
	        case 4: if(n2!=0) {
	               float qt = (float)n1/n2;
	 System.out.println("The quotient of "+n1+" and "+n2+" is "+qt);
	               }
	             else {
	                  System.out.println("Divide by zero error");;
	             }
	        
	            break;
	        
	        default :
	                 System.out.println("Invalid");
	        
	        }
	        sc.close();
	    }
}
