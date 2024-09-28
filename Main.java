import linked_list.ListNode;
import linked_list.MergeTwoSortedLists_21;
import stack.BackspaceStringCompare_844;
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
        BackspaceStringCompare_844 cls = new BackspaceStringCompare_844();
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(cls.backspaceCompare2(s, t));

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
