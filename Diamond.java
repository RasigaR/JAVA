package july31;

public class Diamond {
	 public static void main(String[] args) {
	        int r=5;
	        for(int i=1;i<=r;i++)
	        {
	            //for blank
	            
	            for(int b=1;b<=r-i;b++) //3-1=2  3-2=1  3-3=0
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                //System.out.print(i+" ");
	                System.out.print("* ");
	            }
	            System.out.println();
	            
	        }
	        int r1=4;
	        for(int i=r1;i>=1;i--)
	        {
	            //for blank
	            
	            for(int b=1;b<=r1-i;b++) //3-1=2  3-2=1  3-3=0
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                //System.out.print(" *"+i);
	                System.out.print(" *");
	            }
	            System.out.println();
	            
	        }
	    }
	}
		    