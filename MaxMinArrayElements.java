package Aug02;
import java.util.Scanner;
public class MaxMinArrayElements {
	public static void main(String[] args) {
	int a[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter "+a.length+" elements");
	for(int i=0;i<a.length;i++){
	a[i]=sc.nextInt();
	}
	System.out.println("Array elements  are");
  	for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
	}
	System.out.println("Maximum of an array element");
	int max=a[0];
	for(int i=1;i<a.length;i++){
	if(a[i]>max){
	max=a[i];
	}
	}
	System.out.println(max);
	System.out.println("Minimum of an array element");
	int min=a[0];
	for(int i=1;i<a.length;i++){
	if(a[i]<min){
	min=a[i];
	}
	sc.close();
	}
	System.out.println(min);
	}
	
}
