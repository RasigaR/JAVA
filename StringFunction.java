package Aug03;

public class StringFunction {
	public static void main(String[] args) {
		
		String s="Edubridge";
		        //012345678
		for (int i = 1; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
		}
		for (int i = s.length(); i > 0; i--) {
            System.out.println(s.substring(0, i));
		}
//		System.out.println(s.substring(0,1));
//		System.out.println(s.substring(0,2));
//		System.out.println(s.substring(0,3));
//		System.out.println(s.substring(0,4));
//		System.out.println(s.substring(0,5));
//		System.out.println(s.substring(0,6));
//		System.out.println(s.substring(0,7));
//		System.out.println(s.substring(0,8));
//		System.out.println(s.substring(0,9));
	}

}
