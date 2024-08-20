import binary_search.BinarySearch_704;
import binary_search.FirstBadVersion_278;
import binary_search.GuessNumberHigherOrLower_374;
import binary_search.MaximumCountOfPositiveIntegerAndNegativeInteger_2529;
import binary_search.SearchInsertPosition_35;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MaximumCountOfPositiveIntegerAndNegativeInteger_2529 cls = new MaximumCountOfPositiveIntegerAndNegativeInteger_2529();
        int[] nums = {-2,-1,-1,1,2,3};
        int[] nums2 = {5,20,66,1314};
        int[] nums3 = {-3,-2,-1,0,0,1,2};
        int target = -1;
        int result = cls.maximumCount(nums3);
        System.out.println(result);
    }
}
