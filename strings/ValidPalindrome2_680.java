package strings;

import java.util.ArrayDeque;
import java.util.Queue;

public class ValidPalindrome2_680 {
    public boolean validPalindrome(String s) {
        if (isPalindrome(s)) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;
        while (s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return isPalindrome(s.substring(l, r)) || isPalindrome(s.substring(l + 1, r + 1));

    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
