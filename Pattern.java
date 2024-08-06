package july31;

public class Pattern {
	 public static void main(String[] args) {
		 int r=2;
	        for(int i=1;i<=r;i++)
	        {
	            //for blank
	            
	            for(int b=1;b<=r-i;b++) //3-1=2  3-2=1  3-3=0
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                System.out.print(i+" ");
	                //System.out.print("* ");
	            }
	            System.out.println();
	            
	        }
	        int r1=3;
	        for(int i=1;i<=r1;i++)
	        {
	            //for blank
	            
	            for(int b=1;b<=r1-i;b++) //3-1=2  3-2=1  3-3=0
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                System.out.print(i+" ");
	                //System.out.print("* ");
	            }
	            System.out.println();
	            
	        }
	        int r2=4;
	        for(int i=1;i<=r2;i++)
	        {
	            //for blank
	            
	            for(int b=1;b<=r2-i;b++) //3-1=2  3-2=1  3-3=0
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                System.out.print(i+" ");
	                //System.out.print("* ");
	            }
	            System.out.println();
	            
	        }
	    }
}
