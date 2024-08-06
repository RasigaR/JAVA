package july29;
import java.util.Scanner;
public class Oddoreven {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int num = 0;
			System.out.printf("Enter the Number : ");
			num =sc.nextInt();
			switch (num % 2)
			{
				case 0:
					System.out.printf("This is a Even Number");
					break;
	 
				case 1:
					System.out.printf("This is a Odd Number");
					break;
			}
			sc.close();
		}
	}
