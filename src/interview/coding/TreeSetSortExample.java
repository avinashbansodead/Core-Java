package interview.coding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortExample 
{
    public static void main(String[] args) 
    {
        Integer[] arr = {5, 2, 9, 1, 6};

        // TreeSet automatically sorts elements
        Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(arr));

        // Convert TreeSet to an array
        Integer[] sortedArray = sortedSet.toArray(new Integer[0]);

        // Print the sorted array
        System.out.println(Arrays.toString(sortedArray)); // Output: [1, 2, 5, 6, 9]
    }
}
