package java8.code;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "javaconceptoftheday";

        Map<Character, Long> charCount = input.chars()
        	    .mapToObj(c -> (char) c) // Convert int to Character
        	    .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        Optional<Entry<Character, Long>> first = charCount.entrySet().stream().filter(entry -> entry.getValue()>1).findFirst();
    System.out.println(first.get());
    }
}
