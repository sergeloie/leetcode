import linked_list.ListNode;
import linked_list.MergeTwoSortedLists_21;
import stack.RemoveAllAdjacentDuplicatesInString_1047;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString_1047 cls = new RemoveAllAdjacentDuplicatesInString_1047();
        String s = "";
        System.out.println(cls.removeDuplicates(s));

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
