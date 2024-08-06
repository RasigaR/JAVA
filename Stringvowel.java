package Aug03;

public class Stringvowel {
	public static void main(String[] args) {
		String s="Rasiga";
		int c=0;
		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		c++;
		}
		}
		System.out.println("No of Vowels=" +c);
	}

}
