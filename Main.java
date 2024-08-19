import binary_search.BinarySearch_704;
import binary_search.GuessNumberHigherOrLower_374;
import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.RemoveDuplicatesFromSortedArray_26;
import two_pointers.ReverseString2_541;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GuessNumberHigherOrLower_374 cls = new GuessNumberHigherOrLower_374();
        int[] nums = {-1,0,3,5,9,12, 15};
        int result = cls.guessNumber(10);
        System.out.println(result);
    }
}
