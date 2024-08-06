package july30;
import java.util.Scanner;
public class ATM {
	    public static void main(String[] args) {
	      
	        int a=5000,ch,wd,d;
	        Scanner sc=new Scanner(System.in);
	        System.out.println(" ATM Menu ");
	        System.out.println("1.Display balance");
	        System.out.println("2.Withdrawl ");
	        System.out.println("3.Deposit");
	        
	        System.out.println("enter your choice");
	        ch=sc.nextInt();
	        switch(ch)
	        {
	        case 1:
	            System.out.println("balance amount "+a);
	            break;
	        case 2:
	            System.out.println("Enter the amount to withdraw");
	            wd=sc.nextInt();
	            if(wd<=a)
	            {
	                a=a-wd;
	                System.out.println("your balance amount "+a);
	            }
	            else
	            {
	                System.out.println("You cant withdraw your balance is "+a);
	                
	            }
	            break;
	        case 3:
	            System.out.println("enter the amount to deposit");
	            d=sc.nextInt();
	            a=a+d;
	            System.out.println("After deposit your balance is "+a);
	            break;
	        default:
	            System.out.println("Invalid input");
	        
	        }
	        sc.close();
	    }
	   
	}

