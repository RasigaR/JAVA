package july31;

public class NestedForLoop {
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
		//System.out.println("value of i(outer loop) "+i);
		for(int j=1;j<=4;j++){
		System.out.print(i+" ");
		}
		System.out.println();
		}
}
}

//output:
//1 1 1 1
//2 2 2 2
//3 3 3 3
//4 4 4 4