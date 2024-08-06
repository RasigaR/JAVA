package Aug05;

public class ReverceSplitFunction {
	public static void main(String[] args) {
		String s="Welcome to EduBridge";
		String w[]=s.split(" ");
		System.out.println(w);
		for(int i=0;i<w.length;i++) {
			//System.out.println(w[i]);
			String s1=w[i];
			StringBuffer bf=new StringBuffer(s1);
			System.out.println(bf.reverse().toString());
		}
	}

}
