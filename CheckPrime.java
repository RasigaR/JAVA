package july31;
import java.util.Scanner;
public class CheckPrime {
	 public static void main(String[] args) {
	        //The number divisible by 1 and itself
	        //The number has only two factors
	        //Prime number
	        //Ex: 2(1,2), 3(1,3) 5(1,5)  7 11 13 17
	        
	        int num;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter number");
	        num=sc.nextInt(); //6
	        int c=0;
	        for(int i=1;i<=num;i++) { // 1,2 3 4 5 6
	            if(num%i==0) {
	                //System.out.println(i);
	                c++;
	            }
	        }
	        if(c==2) {
	            System.out.println(num+" is prime");
	        }else {
	            System.out.println(num+" is not a prime");
	        }
	        sc.close();
	    }
	}

