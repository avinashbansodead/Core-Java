package java8.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostRepeatedElement 
{
    public static void main(String[] args) 
    {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");

        // Count occurrences of each element
        Map<String, Long> frequencyMap = 
        		list.stream()
                	.collect(Collectors.groupingBy(str->str, Collectors.counting()));
        
       Optional<Entry<String, Long>> mapEntry =
    		   frequencyMap.entrySet().stream()
    		   						  .max((n1,n2) -> n1.getValue().compareTo(n2.getValue()));
       
       System.out.println(mapEntry.get());
    }
 }