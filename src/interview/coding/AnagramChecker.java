package interview.coding;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        char[] charArray1 = str1.toCharArray();
        str2 = str2.toLowerCase();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
