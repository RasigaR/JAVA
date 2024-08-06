package Aug03;
public class StringExample {
	public static void main(String[] args) {
		String str1 = "Hello, World!";
        String str2 = "Hello, World!";  // str1 and str2 refer to the same object in memory
        
        System.out.println(str1);  // Output: Hello, World!
        System.out.println(str1 == str2);  // Output: true (because both refer to the same object)
    }
}
