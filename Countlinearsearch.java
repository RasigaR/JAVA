package Aug02;
import java.util.Scanner;
public class Countlinearsearch {
	    public static void main(String[] args) {
	        int a[] = new int[6];
	        int key, count = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter " + a.length + " elements");
	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        System.out.println("Enter element to search");
	        key = sc.nextInt();
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == key) {
	                count++;
	            }
	        }
	        if (count > 0) {
	            System.out.println("Successful Search");
	            System.out.println(key + " found " + count + " times.");
	        } else {
	            System.out.println("Unsuccessful Search");
	            System.out.println(key + " not found.");
	        }
	        sc.close();
	    }
	}
