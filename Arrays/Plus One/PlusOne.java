/*
 * LeetCode 66 - Plus One
 * Difficulty: Easy
 *
 * Topics: Array, Math
 *
 * URL:
 * https://leetcode.com/problems/plus-one/
 *
 * Status: Accepted
 * Runtime: 0 ms | Memory: 43.4 MB
 *
 * Example:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation:
 * The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for(i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};

        Solution solution = new Solution();

        int[] result = solution.plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("Expected: " + "[1,2,4]");
    }
}
