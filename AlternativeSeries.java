package july30;

public class AlternativeSeries {
	    public static void main(String[] args) {
	        double sum = 0.0;
	        int n = 10; 

	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                sum -= (float)1 / i; 
	            } else {
	                sum += (float)1 / i; 
	            }
	        }

	        System.out.println("The sum of the series is: " + sum);
	    }
	}

