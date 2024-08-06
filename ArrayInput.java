package Aug02;
import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args){
		int ar[];
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		ar=new int[size];
		System.out.println("Enter "+size+" elements of an Array");
		for(int i=0;i<ar.length;i++){
		ar[i]=sc.nextInt();
		}
		//display array elements
		System.out.println("Array elements  are");
		for(int i=0;i<ar.length;i++){
		System.out.println(ar[i]);
		}
		sc.close();
		}

}
