package aug1;
import java.util.Scanner;
public class infinitearmstrongnumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("Enter number:");
	            String input = sc.next();
	            
	            // Check if the input is "exit" to break the loop
	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting the program.");
	                break;
	            }
	            
	            // Convert the input to an integer
	            int num;
	            try {
	                num = Integer.parseInt(input);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                continue;
	            }

	            int num1 = num;
	            int c = 0;
	            int sum = 0;
	            
	            // Count the number of digits
	            while (num > 0) {
	                c++;
	                num = num / 10;
	            }
	            
	            num = num1;
	            
	            // Calculate the sum of the powers of the digits
	            while (num > 0) {
	                int d = num % 10;
	                sum += Math.pow(d, c);
	                num = num / 10;
	            }
	            
	            System.out.println("Sum = " + sum);
	            if (num1 == sum) {
	                System.out.println(num1 + " is an Armstrong number");
	            } else {
	                System.out.println(num1 + " is not an Armstrong number");
	            }
	        }
	        
	        sc.close();
	    }
	}

