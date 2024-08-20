package Aug17;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapExampleMain {
	public static void main(String[]args) {
		
//		HashMap: Does not maintain any order of the elements.
//		LinkedHashMap: Maintains the insertion order of the elements.
//		TreeMap: Maintains the elements in sorted order based on the keys

		//map will take key, value
		//key is unique
		//value can repeat
		//will not maintain the order
		//no duplicate keys allowed
		HashMap<Long,String> hobj=new HashMap<Long,String>();
		hobj.put(98883459l, "Rasi");
		hobj.put(98883457l, "Priya");
		hobj.put(98883458l, "Nivi");
		
		System.out.println(hobj);
		
		//LinkedHashMap   //Int and String
		//TreeMap //Pid pname
		//maintain the order
		//unique key
		//no duplicate keys allowed
		
		LinkedHashMap<Integer,String> lhobj=new LinkedHashMap<Integer,String>();
		lhobj.put(983459, "Rasi");
		lhobj.put(983457, "Priya");
		lhobj.put(983458, "Nivi");
		lhobj.put(983459, "Rasi");
		lhobj.put(983457, "Priya");
		lhobj.put(983458, "Nivi");
		
		
		System.out.println(lhobj);
		
		
		//maintain the order
		//null is not allowed
		TreeMap<Integer, String>tobj=new TreeMap<Integer, String>();
		tobj.put(983459, "Rasi");
		tobj.put(983457, "Priya");
		tobj.put(983458, "Nivi");
		lhobj.put(983459, "Rasi");
		lhobj.put(983457, "Priya");
		lhobj.put(983458, "Nivi");
		
		System.out.println(tobj);
		
		
		for(Entry<Integer, String> tmapobj:tobj.entrySet()){
			System.out.println(tmapobj.getKey()+"\t"+tmapobj.getValue());		}
	}

}


