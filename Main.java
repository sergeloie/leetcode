import linked_list.ListNode;
import linked_list.MergeTwoSortedLists_21;
import stack.MakeTheStringGreat_1544;
import stack.RemoveAllAdjacentDuplicatesInString_1047;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MakeTheStringGreat_1544 cls = new MakeTheStringGreat_1544();
        String s = "leEeetcode";
        System.out.println(cls.makeGood(s));

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
