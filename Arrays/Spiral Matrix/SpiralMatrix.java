/*
 * LeetCode 54 - Spiral Matrix
 * Difficulty: Medium
 *
 * Topics: Array, Matrix, Simulation
 *
 * URL:
 * https://leetcode.com/problems/spiral-matrix/
 *
 * Status: In Progress (Starter File)
 *
 * Example:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 */

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        Solution solution = new Solution();

        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "[1,2,3,6,9,8,7,4,5]");
    }
}

// Runner class matching filename for Code Runner execution
class SpiralMatrix {
    public static void main(String[] args) {
        Solution.main(args);
    }
}
