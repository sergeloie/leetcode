import two_pointers.FindFirstPalindromicStringInTheArray_2108;
import two_pointers.MoveZeroes_283;
import two_pointers.ReverseVowelsOfAString_345;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MoveZeroes_283 cls = new MoveZeroes_283();
        int[] arr = {0};
        cls.moveZeroes(arr);
        System.out.println((Arrays.toString(arr)));
    }
}
