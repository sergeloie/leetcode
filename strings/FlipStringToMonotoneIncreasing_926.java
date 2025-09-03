package strings;

import java.util.Arrays;

public class FlipStringToMonotoneIncreasing_926 {
    public int minFlipsMonoIncr(String s) {
        int[] flipToGetZero = new int[s.length()];
        int[] flipToGetOne = new int[s.length()];

        if (s.charAt(0) == '1') {
            flipToGetZero[0] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            flipToGetZero[i] = s.charAt(i) == '1'
                    ? flipToGetZero[i - 1] + 1
                    : flipToGetZero[i - 1];
        }

        if ((s.charAt(s.length() - 1)) == '0') {
            flipToGetOne[s.length() - 1] = 1;
        }

        for (int i = s.length() - 2; i >= 0 ; i--) {
            flipToGetOne[i] = s.charAt(i) == '0'
                    ? flipToGetOne[i + 1] + 1
                    : flipToGetOne[i + 1];
        }

        System.out.println(Arrays.toString(flipToGetZero));
        System.out.println(Arrays.toString(flipToGetOne));

        return 0;
    }
}
