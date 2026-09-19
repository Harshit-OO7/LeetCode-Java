/*
 * LeetCode 104 - Maximum Depth of Binary Tree
 * Difficulty: Easy
 *
 * Topics: Tree, Binary Tree
 *
 * URL:
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Status: Accepted
 *
 * Example:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 */

import java.util.*;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromLevelOrder("[3,9,20,null,null,15,7]");

        Solution solution = new Solution();

        int result = solution.maxDepth(root);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "3");
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode fromLevelOrder(String str) {
        if (str == null || str.isEmpty() || str.equals("[]")) return null;
        String trimmed = str.replaceAll("[\[\]\s]", "");
        if (trimmed.isEmpty()) return null;
        String[] parts = trimmed.split(",");
        if (parts.length == 0 || parts[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < parts.length) {
            TreeNode curr = queue.poll();
            if (!parts[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(parts[i]));
                queue.add(curr.left);
            }
            i++;
            if (i < parts.length && !parts[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(parts[i]));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static String toLevelOrderString(TreeNode root) {
        if (root == null) return "[]";
        List<String> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                list.add(String.valueOf(curr.val));
                queue.add(curr.left);
                queue.add(curr.right);
            } else {
                list.add("null");
            }
        }
        while (list.size() > 0 && list.get(list.size() - 1).equals("null")) {
            list.remove(list.size() - 1);
        }
        return "[" + String.join(", ", list) + "]";
    }
}
