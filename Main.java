import array.FindAllNumbersDisappearedInAnArray_448;
import arrays.MaximumProductOfThreeNumbers_628;
import arrays.NextGreaterElement1_496;
import arrays.ThirdMaximumNumber_414;
import strings.DetectCapital_520;
import strings.LicenseKeyFormatting_482;
import strings.MostCommonWord_819;
import strings.ReverseWordsInAString3_557;
import strings.RotateString_796;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MostCommonWord_819 cls = new MostCommonWord_819();
        int[] nums1 = new int[]{4,3,2,7,8,2,3,1};
        int[] nums2 = new int[]{1,1};

        String paragraph  = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[]{"a"};

        System.out.println(cls.mostCommonWord(paragraph, banned));
//        StringBuilder sb = new StringBuilder("ABCDEFG");
//        System.out.println(sb.insert(4, 4).insert(2,2));




    }
}


