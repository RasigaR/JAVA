package aug1;

import java.util.Scanner;

public class Loopwhile {
	 public static void main(String[] args) {
	        int d,num,rev,num1;
	        rev=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Number:");
	        num=sc.nextInt();
	        num1=num;
	                  
	        while(num>0) {   
	          d=num%10;
	          rev = rev*10+d; 
	          num = num/10; 
	          
	        }
	        System.out.println("Reversed number is "+rev);
	        System.out.println("Original number is "+num1);
	        if(num1==rev) { 
	            System.out.println("Pallandrome");
	        }else {
	            System.out.println("Not pallandrome");
	        }
	        sc.close();
	    }
	}
