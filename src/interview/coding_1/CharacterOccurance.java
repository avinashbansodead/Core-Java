package interview.coding_1;
import java.util.HashMap;
import java.util.Map;

	public class CharacterOccurance 
	{
	    public static void main(String[] args) 
	    {
	        String str = "Hello Good Morning";

	        // Step 1: Convert to lowercase and remove spaces
	        str = str.toLowerCase().replace(" ", "");

	        // Step 2: Convert string to char array
	        char[] list = str.toCharArray();

	        Map<Character, Integer> map = new HashMap<>();

	        // Step 3: Count character occurrences (original logic)
	        for (char ch : list) 
	        {
	            if (!map.containsKey(ch)) 
	            {
	                map.put(ch, 1);
	            } 
	            else 
	            {
	                Integer value = map.get(ch);
	                value++;
	                map.put(ch, value);
	            }
	        }

	        System.out.println(map);
	    }
	}


