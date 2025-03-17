package interview.coding;

public class MissingNumber 
{
    public static int findMissingNumber(int[] nums) 
    {
        int n = nums.length + 1;  // As one number is missing
        int expectedSum = (n * (n + 1)) / 2;  // Sum of first n numbers
        int actualSum = 0;

        // Sum of elements in the array
        for (int num : nums) {
            actualSum += num;
        }

        // Missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3};  // 5 is missing
        System.out.println(findMissingNumber(nums));  // Output: 5
    }
}
