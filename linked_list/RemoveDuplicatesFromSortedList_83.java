package linked_list;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
83. Remove Duplicates from Sorted List
Easy
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */

public class RemoveDuplicatesFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            setNextToNotEqualVal(current);
            current = current.next;
        }
        return head;
    }

    public void setNextToNotEqualVal(ListNode node) {
        while (node != null && node.next != null && node.val == node.next.val) {
            node.next = node.next.next;
        }
    }
}
