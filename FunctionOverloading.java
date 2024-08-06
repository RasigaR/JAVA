package Aug05;
class Arithmetic{
	 void add(int i, int j) {
	        int s = i + j;
	        System.out.println("Sum of two ints: " + s);
	 }
	 void add(byte i, byte j) {
	        byte s = (byte) (i + j); // Explicit casting to avoid type promotion
	        System.out.println("Sum of two bytes: " + s);
	    }
	 void add(short i, short j) {
	        short s = (short) (i + j); // Explicit casting to avoid type promotion
	        System.out.println("Sum of two shorts: " + s);
	    }
	 void add(long i, long j) {
	        long s = i + j;
	        System.out.println("Sum of two longs: " + s);
	    }
	 void add(float i, float j) {
	        float s = i + j;
	        System.out.println("Sum of two floats: " + s);
	    }
	 void add(double i, double j) {
	        double s = i + j;
	        System.out.println("Sum of two doubles: " + s);
	    }
}

public class FunctionOverloading {
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		obj.add(5, 10);           
        obj.add((byte) 5, (byte) 10); 
        obj.add((short) 5, (short) 10); 
        obj.add(5L, 10L);         
        obj.add(5.0f, 10.0f);    
        obj.add(5.0, 10.0);  
	}
}

