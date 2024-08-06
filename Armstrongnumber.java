package aug1;
import java.util.Scanner;
public class Armstrongnumber {
	public static void main(String[] args) {
		int num, d, c=0;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextInt();
		int num1=num;
		while(num>0) {
			c++;
			num=num/10;
		}		
		num = num1;
		while(num>0) {
			d = num%10;
			sum=(int) (sum+Math.pow(d,c));
			num=num/10;
		}
		System.out.println("Sum ="+sum);
		if(num1==sum) {
			System.out.println(num1+" is Armstrong number");
		}else {
			System.out.println(num1+"is  not Armstrong number");
		}
		sc.close();
	}

}
