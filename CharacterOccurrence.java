package Aug17;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "Rasiga";
        Map<Character, Integer> charCountMap = new HashMap<>();
        // Start the recursive function
        countCharacters(str, 0, charCountMap);
        
        // Print the character occurrences
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Recursive method to count characters
    public static void countCharacters(String str, int index, Map<Character, Integer> charCountMap) {
        // Base case: If the index reaches the length of the string, stop recursion
        if (index == str.length()) {
            return;
        }

        // Get the current character
        char c = str.charAt(index);

        // Update the map with the current character's count
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

        // Recur for the next character
        countCharacters(str, index + 1, charCountMap);
    }
}


//import java.util.HashMap;
//import java.util.Map;
//
//public class CharacterOccurrence {
//	 public static void main(String[] args) {
//	        String str = "Rasiga";
//	        Map<Character, Integer> charCountMap = new HashMap<>();
//	        for (char c : str.toCharArray()) { //[r,a,s,i,g,a]
//	            if (charCountMap.containsKey(c)) {
//	                charCountMap.put(c, charCountMap.get(c) + 1);
//	            } else {
//	            	charCountMap.put(c, 1);
//	            }
//	        }    
//	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//	            System.out.println(entry.getKey() + " -> " + entry.getValue());
//	        }
//	    }
//	}
//
