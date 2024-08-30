import linked_list.ListNode;
import linked_list.MergeTwoSortedLists_21;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeTwoSortedLists_21 cls = new MergeTwoSortedLists_21();

        ListNode ls13 = new ListNode(40);
        ListNode ls12 = new ListNode(2, ls13);
        ListNode ls11 = new ListNode(1, ls12);

        ListNode ls23 = new ListNode(5);
        ListNode ls22 = new ListNode(3, ls23);
        ListNode ls21 = new ListNode(1, ls22);

        ListNode n1 = null;
        ListNode n2 = null;

        ListNode head = cls.mergeTwoLists(ls12, ls21);

        printListNode(head);

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
