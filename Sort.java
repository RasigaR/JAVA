package Aug12;
import java.util.HashMap;
import java.util.Map;
public class Sort {
	 public char maxOccurringChar(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        int maxCount = 0;
	        char maxChar = '\0';  // null character initialization

	        // Count occurrences of each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	            
	            // Update maxChar if current character has higher count or first in case of a tie
	            if (charCountMap.get(ch) > maxCount) {
	                maxCount = charCountMap.get(ch);
	                maxChar = ch;
	            } 
	        }
	        
	        return maxChar;
	    }

	    public static void main(String[] args) {
	        Sort sort = new Sort();
	        String str = "DoSelect";
	        System.out.println(sort.maxOccurringChar(str));  // Output should be 'e'
	    }

}
