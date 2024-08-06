package Aug03;
import java.util.Scanner;
public class UserValidation {
	public static void main(String[] args) {
		String uname, upass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and Password");
		uname=sc.next();
		upass=sc.next();
		if(uname.equalsIgnoreCase("rasi") && upass.equals("rasi123")){
		System.out.println("valid User");
		}
		else{
		System.out.println("Invalid user");
		}
		sc.close();
	}

}
