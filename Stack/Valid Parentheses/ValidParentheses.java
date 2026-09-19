/*
 * LeetCode 20 - Valid Parentheses
 * Difficulty: Easy
 *
 * Topics: String, Stack
 *
 * URL:
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Status: Accepted
 *
 * Example:
 * Input: s = "()[]{}"
 * Output: true
 */

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        Solution solution = new Solution();

        boolean result = solution.isValid(s);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "true");
    }
}
