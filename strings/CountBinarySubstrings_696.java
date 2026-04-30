package strings;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings_696 {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            int temp = countSameDigits(s, index);
            list.add(temp);
            index += temp;
        }

        int result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            result += Math.min(list.get(i), list.get(i + 1));
        }
        return result;
    }


    private int countSameDigits(String s, int index) {
        if (index >= s.length()) {
            return 0;
        }
        char ch = s.charAt(index);
        int result = 1;
        index++;
        while (index < s.length() && s.charAt(index) == ch) {
            index++;
            result++;
        }
        return result;
    }
}
