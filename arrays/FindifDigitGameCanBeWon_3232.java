package arrays;

public class FindifDigitGameCanBeWon_3232 {
    public boolean canAliceWin(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num >= 10) {
                count2 += num;
            } else {
                count1 += num;
            }
        }
         return count1 != count2;
    }
}
