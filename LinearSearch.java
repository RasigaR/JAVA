package Aug02;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int a[]=new int[6];
        int key, pos=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+a.length+" elements");
        for(int i=0;i<a.length;i++){
        	a[i]=sc.nextInt();
        	}
        System.out.println("Enter element to search");
        key=sc.nextInt();
        for(int i=0;i<a.length;i++){
        	if(a[i]==key){
        		pos=i;
        		break;
        		}
        	}
        if(pos !=-1){
        	System.out.println("Succesful Search");
        	System.out.println(key+" found at position "+(pos+1));
        	}
        else{
        	System.out.println("Unsuccesful Search");
        	System.out.println(key+" Not found ");
        	}
        sc.close();    
	}
	}
