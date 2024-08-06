package Aug03;

public class IndexofMethod {
	public static void main(String[] args) {
		String s="Mahathma Karamchad Gandhi";
//		String initial1 = parts[0].substring(0, 1);
//        String initial2 = parts[1].substring(0, 1);
//        String lastName = parts[2];
//        String result = initial1 + "." + initial2 + "." + lastName;
//        System.out.println(result);
		System.out.print(s.charAt(0)+".");
		int  i=s.indexOf(' ');
		System.out.print(s.charAt(i+1)+".");
		int j=s.lastIndexOf(' ');
		System.out.print(s.substring(j+1));
	}

}
