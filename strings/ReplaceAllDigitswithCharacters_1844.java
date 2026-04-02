package strings;

public class ReplaceAllDigitswithCharacters_1844 {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i = i + 2) {
            arr[i] = shift(arr[i], arr[i - 1] - '0');
        }
        return String.valueOf(arr);
    }

    private char shift(char ch, int offset) {
        return (char) (ch + offset);
    }
}
