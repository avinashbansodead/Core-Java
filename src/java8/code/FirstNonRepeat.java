
package java8.code;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FirstNonRepeat
{
    public static void main(String[] args) 
    {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

     Map<String, Long> strCount =
    		 list.stream()
        		.collect(Collectors.groupingBy(str->str, Collectors.counting()));
        
     Optional<Entry<String, Long>> firstNonRepeat = 
    		strCount.entrySet().stream()
    		 				 	.filter(entry -> entry.getValue()==1).findFirst();
        
     System.out.println("First Non-Repeating Element: " + firstNonRepeat.get());
    }
}


