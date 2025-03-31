
/*
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount
 *  of money stashed,but you cannot rob two adjacent houses,as it will alert the police. 
 *  Given an integer array nums representing the amount of money
 *  at each house, return the maximum amount you can rob. Example 1: Input: nums = [1,2,3,1] Output: 4 
 *  Explanation: Rob house 1 (money = 1) and then rob 
 * house 3 (money = 3). Total amount you can rob = 1 + 3 = 4. Example 2: Input: nums = [2,7,9,3,1]
 */

package interview.coding;
public class HouseRobbery 
{
	
    public static int rob(int[] nums) 
    {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int maxMoney = 0;  

        for (int i = 0; i < nums.length; i++) // Loop through each house
        	
        { 
            int sum = 0;
            
            for (int j = i; j < nums.length; j += 2) 
            { // Skip adjacent houses
                sum += nums[j]; 
            }
            maxMoney = Math.max(maxMoney, sum); // Keep track of max loot
        }

        return maxMoney;
    }

    
    public static void main(String[] args) 
    {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Max Robbed Money: " + rob(nums1)); // Output: 4

        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("Max Robbed Money: " + rob(nums2)); // Output: 12
    }
}

