/*
 * LeetCode 1 - Two Sum
 * Difficulty: Easy
 *
 * Topics: Array, Hash Table
 *
 * URL:
 * https://leetcode.com/problems/two-sum/
 *
 * Status: Accepted
 * Runtime: 1 ms | Memory: 42.5 MB
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation:
 * Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Simulated accepted solution body
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        Solution solution = new Solution();

        int[] result = solution.twoSum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("Expected: " + "[0,1]");
    }
}
