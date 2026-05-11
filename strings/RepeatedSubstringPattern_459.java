package strings;

public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        int middle = s.length() / 2;
        for (int i = 1; i <= middle ; i++) {
            String pattern = s.substring(0, i);
            if (rsp(s, pattern)) {
                return true;
            }
        }
        return false;

    }

    private boolean rsp(String s, String pattern) {
        if (s.length() % pattern.length() != 0) {
            return false;
        }
        int count = s.length() / pattern.length();
        for (int i = 0; i < count; i++) {
            if (!s.substring(i * pattern.length(), (i + 1) * pattern.length()).equals(pattern)) {
                return false;
            }
        }
        return true;
    }
}
