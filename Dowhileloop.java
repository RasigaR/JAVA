package aug1;
import java.util.Scanner;
public class Dowhileloop {
		    public static void main(String args[]) {
		        int a, b;
		        double result;
		        Scanner sc = new Scanner(System.in);
		        char ch;
		        
		        do {
		            System.out.println("Choose the option to find area.. ");
		            System.out.println("1. Square");
		            System.out.println("2. Rectangle");
		            System.out.println("3. Triangle");
		            System.out.println("4. Circle");
		            System.out.println("Enter your choice:");
		            int option = sc.nextInt();
		            
		            switch(option) {
		                case 1:
		                    System.out.println("Enter the side of the square");
		                    a = sc.nextInt();
		                    result = a * a;
		                    System.out.println("Area of the square = " + result);
		                    break;
		                
		                case 2:
		                    System.out.println("Enter the length and width of the rectangle");
		                    a = sc.nextInt();
		                    b = sc.nextInt();
		                    result = a * b;
		                    System.out.println("Area of the rectangle = " + result);
		                    break;
		                
		                case 3:
		                    System.out.println("Enter the base and height of the triangle");
		                    a = sc.nextInt();
		                    b = sc.nextInt();
		                    result = 0.5 * a * b;
		                    System.out.println("Area of the triangle = " + result);
		                    break;
		                
		                case 4:
		                    System.out.println("Enter the radius of the circle");
		                    a = sc.nextInt();
		                    result = 3.14159 * a * a;
		                    System.out.println("Area of the circle = " + result);
		                    break;
		                
		                default:
		                    System.out.println("Invalid choice, please try again.");
		            }
		            
		            System.out.println("Do you want to continue? Press 'y' to continue, any other key to stop.");
		            ch = sc.next().charAt(0);
		        } while (ch == 'y' || ch == 'Y');
		        sc.close();
		    }
		}


