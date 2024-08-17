package Aug14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetMain {
	public static void main(String[] arhs) {
		
		
		HashSet<Integer>hob=new HashSet<Integer>();
		hob.add(56);
		hob.add(23);
		hob.add(12);
		hob.add(34);
		hob.add(null);
		
		System.out.println(hob);
		
		
		//LinkedHash maintains the order
		//Duplicate elements not allowed
		LinkedHashSet<Integer>lhset=new LinkedHashSet<Integer>();
		lhset.add(56);
		lhset.add(23);
		lhset.add(12);
		lhset.add(34);
		lhset.add(null);
		lhset.add(56);
		lhset.add(23);
		lhset.add(12);
		lhset.add(34);
		lhset.add(null);
		
		System.out.println(lhset);
		
		
		//null is not allowed
		TreeSet<Integer>tobj=new TreeSet<Integer>();
	    tobj.add(56);
	    tobj.add(23);
	    tobj.add(12);
	    tobj.add(34);
	    //tobj.add(null);
	    
	    System.out.println(tobj);
	}

}
