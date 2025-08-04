package math;

public class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) {
            return String.valueOf((char)('A' + columnNumber - 1));
        }

        int chastnoe = columnNumber / 26;
        int ostatok = columnNumber % 26;

        return convertToTitle(chastnoe) + convertToTitle(ostatok);
    }
}
