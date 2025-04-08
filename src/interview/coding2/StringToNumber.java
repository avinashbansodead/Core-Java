package interview.coding2;

public class StringToNumber 
{

    public static int convertToNumber(String column)
    {
        int result = 0;
        for (int i = 0; i < column.length(); i++) 
        {
            char ch = column.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("A  => " + convertToNumber("A"));    // 1
        System.out.println("Z  => " + convertToNumber("Z"));    // 26
        System.out.println("AA => " + convertToNumber("AA"));   // 27
        System.out.println("AZ => " + convertToNumber("AZ"));   // 52
        System.out.println("BA => " + convertToNumber("BA"));   // 53
        
    }
}
