package interview.coding_1;

import java.util.*;

public class NumberOccurance 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1, 5, 6, 2, 3, 1, 3, 6, 5, 6, 8);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : list) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                Integer value = map.get(num);
                value++;
                map.put(num, value);
            }
        }

        System.out.println(map);
    }
}

