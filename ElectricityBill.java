package july29;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String args[]){  
	int units;
	String name;  
	float billamount = 0;  
	float totalamount=0;
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter your name");
	name=sc.nextLine();
	System.out.println("Enter number of units");  
	units = sc.nextInt();  
	if(units>=1 && units <= 100)  
	{  
	billamount = units * 2.0f;  
	}  
	else if(units>=100 && units<= 300){  
	billamount = 100 * 2.0f + (units - 100) * 3.0f;  
	}  
	else  
	{  
	billamount = 100 * 2.0f + (units-200) * 3.0f + (units - 300) * 5.0f;
	totalamount=billamount+(billamount*2.5f/100);
	}    
	System.out.println("Name=" +name);
	System.out.println("Units consumed=" +units);
	System.out.println("Bill amount="+billamount);
	System.out.println("Total amount="+totalamount);
	sc.close();
	}
	
}
