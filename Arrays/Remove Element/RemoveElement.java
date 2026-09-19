/*
 * LeetCode 27 - Remove Element
 * Difficulty: Easy
 *
 * Topics: Array, Two Pointers
 *
 * URL:
 * https://leetcode.com/problems/remove-element/
 *
 * Status: In Progress (Starter File)
 *
 * Example:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation:
 * Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        Solution solution = new Solution();

        int result = solution.removeElement(nums, val);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "2, nums = [2,2,_,_]");
    }
}
