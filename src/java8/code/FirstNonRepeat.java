package java8.code;

import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        String firstNonRepeat = list.stream()
                .filter(s -> Collections.frequency(list, s) == 1) // Check frequency
                .findFirst()
                .orElse(null); // Get the first non-repeating element or null

        System.out.println("First Non-Repeating Element: " + firstNonRepeat);
    }
}

