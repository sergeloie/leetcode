package linked_list;

/*
https://leetcode.com/problems/middle-of-the-linked-list/description/
876. Middle of the Linked List
Easy

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

 */

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        int length = getLength(head);
        int middle = length / 2 + 1;
        ListNode result = head;
        for (int i = 1; i < middle; i++) {
            result = result.next;
        }
        return result;
    }

    public int getLength(ListNode listNode) {
        int count = 0;
        ListNode current = listNode;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
