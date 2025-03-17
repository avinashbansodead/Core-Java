/*
 * Given an integer array in Java, provide a target value and return the two
 *  indices of the array whose sum is equal to the target value. 
 */
package interview.coding;

public class TwoSum 
{
    public static int[] findTwoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j}; // Return indices
                }
            }
        }
        return new int[]{-1, -1}; // Return -1 if no pair found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
