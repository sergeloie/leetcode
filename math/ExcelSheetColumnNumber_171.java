package math;

public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String columnTitle) {
        int pow = 1;
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >= 0 ; i--) {
            int current = columnTitle.charAt(i) - 'A' + 1;
            sum += current * pow;
            pow *= 26;
        }
        return sum;
    }
}
