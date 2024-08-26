package linked_list;

/*
https://leetcode.com/problems/reverse-linked-list/description/
206. Reverse Linked List
Easy
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 */

public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode l = null;
        ListNode c = head;
        ListNode r = head;
        while (r != null) {
            r = c.next;
            c.next = l;
            l = c;
            c = r;
        }
        return l;
    }
}
