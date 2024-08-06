package Aug02;
import java.util.Arrays;
public class Sort {
	 public static void main(String[] args) {
	        int a[]= {5,3,1,8,9}; 
	        //numbers in ascending output : 1 3 5 8 9
	        
	        Arrays.sort(a);
	        for(int i=0;i<a.length;i++) {
	        
	        System.out.println(a[i]);
	        }
	       System.out.println("Second smallest element is "+a[1]);
	       System.out.println("Second largest "+a[a.length-2]);
	    }
	
}
