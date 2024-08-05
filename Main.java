import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 cls = new RemoveDuplicatesFromSortedArray_26();
        int[] arr = {1};
        int result = cls.removeDuplicates(arr);
        System.out.println(result);
        System.out.println((Arrays.toString(arr)));
    }
}
