package strings;

public class RemoveOutermostParentheses_1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int start = 0;
        int end = 1;
        while (end < s.length()) {
            if (s.charAt(end) == '(') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                sb.append(s, start + 1, end);
                start = end + 1;
                end = start + 1;
                count = 1;
            } else {
                end++;
            }
        }
        return sb.toString();
    }
}
