package Aug02;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		int a[]={5,4,2,6,3};
		int temp;
		Arrays.sort(a);
		//for(int i=0;i<a.length;i++){
		//	System.out.println(a[i]);
			//}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++)
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		System.out.println("Sorted elements are:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
		}
	}
