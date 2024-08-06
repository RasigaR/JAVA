package aug1;
import java.util.Scanner;
public class UserInputArray {
	 public static void main(String[] args) {
	        //int ar[]=new int[5]; //declaration of an array
	        int []ar=new int[5];
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter "+ar.length+"  array elements");
	        for(int i=0;i<ar.length;i++) {
	            ar[i] = sc.nextInt();
	        }
	        
	        //Display array elements
	        
	        for(int i=0;i<ar.length;i++) {
	            System.out.println(ar[i]);
	        }
	        sc.close();
	    }
	}

