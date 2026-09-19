/*
 * LeetCode 21 - Merge Two Sorted Lists
 * Difficulty: Easy
 *
 * Topics: Linked List, Recursion
 *
 * URL:
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Status: Accepted
 * Runtime: 0 ms | Memory: 44.2 MB
 *
 * Example:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = list1;
        ListNode tail = list2;
        ListNode dummy = new ListNode();
        ListNode newnode = dummy;
        while(curr!=null && tail!=null)
        {
            if(curr.val>tail.val)
            {
                newnode.next = tail;
                newnode = newnode.next;
                tail = tail.next;
            }
            else
            {
                newnode.next = curr;
                newnode = newnode.next;
                curr = curr.next;
            }
        }
        if(curr!=null)
        {
            newnode.next = curr;
            newnode = newnode.next;
        }
        if(tail!=null)
        {
            newnode.next = tail;
            newnode = newnode.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.fromArray(new int[]{1,2,4});
        ListNode list2 = ListNode.fromArray(new int[]{1,3,4});

        Solution solution = new Solution();

        ListNode result = solution.mergeTwoLists(list1, list2);

        System.out.println("Output: " + ListNode.toString(result));
        System.out.println("Expected: " + "[1,1,2,3,4,4]");
    }
}
