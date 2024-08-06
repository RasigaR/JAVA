package aug1;

public class ArraysDemo {
	 public static void main(String[] args) {
	        
	        
	        
	        int ar[]= {4,6,8,3,2,7}; //array declaration and intialization
	                 //0 1 2 3 4 5
	       // System.out.println(ar[0]);//4
	       // System.out.println(ar[4]);//2
	       // System.out.println(ar[5]);//7
	        //System.out.println(ar[6]);  //exception
	        
	        System.out.println("No of elements ="+ar.length);
	        
	        //Display all the elements of an array
	        for(int i=0;i<ar.length;i++) {
	            System.out.println(ar[i]);
	        }
	    }
	}
