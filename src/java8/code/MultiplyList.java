package java8.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyList 
{
    public static void main(String[] args) 
    {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3, 4, 5),
            Arrays.asList(6, 7, 8, 9)
        );

        // Flatten the list and multiply each number by 2
        List<Integer> multipliedList = 
        		listOfLists.stream()
                .flatMap(list->list.stream()) // Flatten the nested lists into a single stream
                .map(num -> num * 2)   // Multiply each number by 2
                .collect(Collectors.toList()); // Collect into a new list

        System.out.println(multipliedList);
    }
}

