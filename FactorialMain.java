package july30;
import java.util.Scanner;
public class FactorialMain {
	    public static void main(String[] args) {
	    
	        //factorial =5*4*3*2*1
	        
	        int num; 
	        long fact=1;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number");
	        num = sc.nextInt();
	        
	        for(int i=num;i>=1;i--) {
	            
	            fact =fact*i; //fact =5*1=5  fact=5*4=20  fact = 20*3=60  fact=60*2=120
	                           //fact =120*1=120
	            
	        }
	        System.out.println("Factorial of "+num+" is "+fact);
	        sc.close();
	    }
	}


