package Aug12;
import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        double u = 36 * 1000.0 / 3600;  // Initial velocity in meters per second
        double a = 5;  // Acceleration in meters per second squared

        // Read time intervals
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        // Calculate distances
        int distance1 = calculateDistance(u, a, t1);
        int distance2 = calculateDistance(u, a, t2);

        // Output the results
        System.out.println(distance1);
        System.out.println(distance2);
        
        scanner.close();
    }

    public static int calculateDistance(double u, double a, int t) {
        double distance = (u * t) + ((a * t * t) / 2);
        return (int) distance;  // Casting to int for output
    }

}
