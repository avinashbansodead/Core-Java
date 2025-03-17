package interview.coding;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String subStr = "";
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if (subStr.contains(currentChar + "")) {
                    break; // Stop if a duplicate is found
                }
                subStr += currentChar; // Add character to substring
                maxLength = Math.max(maxLength, subStr.length()); // Update maxLength
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
    }
}
