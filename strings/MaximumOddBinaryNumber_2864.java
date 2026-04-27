package strings;

public class MaximumOddBinaryNumber_2864 {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            oneCount = s.charAt(i) == '1' ? oneCount + 1 : oneCount;
        }
        return new StringBuilder()
                .repeat('1', oneCount > 1 ? oneCount - 1 : 0)
                .repeat('0', s.length() - oneCount)
                .append('1')
                .toString();
    }
}
