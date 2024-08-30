package linked_list;

/*
https://leetcode.com/problems/remove-linked-list-elements/description/
203. Remove Linked List Elements
Easy
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.



Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 */

public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
        while (newHead != null && newHead.val == val) {
            newHead = newHead.next;
        }
        ListNode current = newHead;
        while (current != null && current.next != null) {
            setNextToNonTarget(current,val);
            current = current.next;
        }
        return newHead;
    }

    public void setNextToNonTarget(ListNode node, int target) {
        while (node.next != null && node.next.val == target) {
            node.next = node.next.next;
        }
    }
}
