package strings;

public class DecryptStringfromAlphabettoIntegerMapping_1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int index = s.length() - 1;

        while (index >= 0) {
            if (s.charAt(index) == '#') {
                int nr = charToDigit(s.charAt(--index));
                int nl = charToDigit(s.charAt(--index));
                sb.append(numberToChar(nl * 10 + nr));
            } else {
                sb.append(numberToChar(charToDigit(s.charAt(index))));
            }
            index--;
        }

        return sb.reverse().toString();

    }

    private int charToDigit(char ch) {
        return ch - '0';
    }

    private char numberToChar(int number) {
        return (char) ('a' + number - 1);
    }
}
