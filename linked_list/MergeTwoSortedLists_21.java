package linked_list;

/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
21. Merge Two Sorted Lists
Easy
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode next1 = list1;
        ListNode next2 = list2;
        ListNode current = null;

        if (next1 != null & next2 != null) {
            if (next1.val <= next2.val) {
                head = next1;
                next1 = next1.next;
            } else {
                head = next2;
                next2 = next2.next;
            }
        } else if (next1 == null && next2 == null) {
            return null;
        } else if (next1 == null) {
            head = next2;
            next2 = next2.next;
        } else if (next2 == null) {
            head = next1;
            next1 = next1.next;
        }
        current = head;
        while (next1 != null || next2 != null) {
            if (next1 != null & next2 != null) {
                if (next1.val <= next2.val) {
                    current.next = next1;
                    current = next1;
                    next1 = next1.next;
                } else {
                    current.next = next2;
                    current = next2;
                    next2 = next2.next;
                }
            } else if (next1 == null) {
                current.next = next2;
                current = next2;
                next2 = next2.next;
            } else if (next2 == null) {
                current.next = next1;
                current = next1;
                next1 = next1.next;
            }
        }
        return head;
    }
}
