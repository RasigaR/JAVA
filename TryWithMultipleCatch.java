package Au13;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
        int ar[]= {2,4,6};
        
        try {
            c=a/b;
            System.out.println(ar[4]);
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
	}

}
