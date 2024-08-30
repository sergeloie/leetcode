package linked_list;

/*
https://leetcode.com/problems/palindrome-linked-list/description/
234. Palindrome Linked List
Easy
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        int[] vals = new int[100000];
        int l = 0;
        int r = 0;
        ListNode current = head;
        while (current != null) {
            vals[r++] = current.val;
            current = current.next;
        }
        r--;
        while (l < r) {
            if (vals[l] != vals[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
