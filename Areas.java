package july29;
import java.util.Scanner;
public class Areas {
	public static void main(String args[]) {
		int a,b;
		double result;
		for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the option to find area.. ");
		System.out.println("1.Square");
		System.out.println("2.Rectange ");
		System.out.println("3.Triangle ");
		System.out.println("4.Circle");
		System.out.println("Enter your choice:");
		int option = sc.nextInt();
		switch(option) {
		case 1:System.out.println("Enter the side of square");
			a= sc.nextInt();
			result = a*a;
			System.out.println(" Area of the square =  "+result);
			
		
		case 2:System.out.println("Enter the length and width of rectangle");
			a= sc.nextInt();
			b=sc.nextInt();
			result = a*b;
			System.out.println(" Area of the square =  "+result);
			
		
		case 3:System.out.println("Enter the length and breadth of triangle");
			a= sc.nextInt();
			b= sc.nextInt();
			result = 0.5*a*b;
			System.out.println(" Area of the square =  "+result);
		
		case 4:System.out.println("Enter the radius of the circle");
		    a= sc.nextInt();
	     	result = 3.14159*a*a;
	    	System.out.println(" Area of the square =  "+result);
		
		
		}
		
		System.out.println("Do you want to continue press Y any other key to stop");
		char ch=sc.next().charAt(0);
		if(ch!='y'){
		continue;
		}
		sc.close();
	}
		
}
}