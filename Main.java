import binary_search.BinarySearch_704;
import binary_search.FirstBadVersion_278;
import binary_search.GuessNumberHigherOrLower_374;
import binary_search.SearchInsertPosition_35;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchInsertPosition_35 cls = new SearchInsertPosition_35();
        int[] nums = {1,3,5,6};
        int target = -1;
        int result = cls.searchInsert(nums, target);
        System.out.println(result);
    }
}
