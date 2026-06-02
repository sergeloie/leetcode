package strings;

public class NumberofLinesToWriteString_806 {
    public int[] numberOfLines(int[] widths, String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = widths[s.charAt(i) - 'a'];
        }
        int rowCount = 1;
        int rowLength = 0;
        for (int num : nums) {
            if (rowLength + num > 100) {
                rowCount++;
                rowLength = num;
            } else {
                rowLength += num;
            }
        }
        return new int[]{rowCount, rowLength};
    }
}
