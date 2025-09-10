package strings;

public class ClearDigits_3174 {
    public String clearDigits(String s) {
        if (!s.matches(".*\\d.*")) {
            return s;
        }

        int digitIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digitIndex = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(digitIndex);
        sb.deleteCharAt(digitIndex - 1);
        return clearDigits(sb.toString());
    }


    public String clearDigits2(String s) {
        char[] chars = s.toCharArray();
        int lastIndex = s.length() - 1;
        for (int i = 1; i <= lastIndex; i++) {
            if (Character.isDigit(chars[i])) {
                chars[i] = ' ';
                int charIndex = i - 1;
                while (!Character.isAlphabetic(chars[charIndex])) {
                    charIndex--;
                }
                chars[charIndex] = ' ';
            }

        }
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
