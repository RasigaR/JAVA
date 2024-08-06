package Aug03;

public class MainAppStrfun {
	public static void main(String[] args) {
		String s=null;
		if(s==null){
		System.out.println(s);
		}
		else{
			System.out.println("not a null value");
		}
		
		String s1=" ";
		System.out.println(s1.isBlank());
	    System.out.println(s1.length());
		String s2="";
		System.out.println(s2.isEmpty());
		System.out.println(s2.length());
		
	}
	

}
