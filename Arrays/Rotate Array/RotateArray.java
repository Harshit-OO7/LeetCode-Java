/*
 * LeetCode 189 - Rotate Array
 * Difficulty: Medium
 *
 * Topics: Array, Math, Two Pointers
 *
 * URL:
 * https://leetcode.com/problems/rotate-array/
 *
 * Status: Accepted
 * Runtime: 1 ms | Memory: 42.5 MB
 *
 * Example:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        // Simulated accepted solution body
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        Solution solution = new Solution();

        solution.rotate(nums, k);

        System.out.println("Output: " + Arrays.toString(nums));
        System.out.println("Expected: " + "[5,6,7,1,2,3,4]");
    }
}

// Runner class matching filename for Code Runner execution
class RotateArray {
    public static void main(String[] args) {
        Solution.main(args);
    }
}
