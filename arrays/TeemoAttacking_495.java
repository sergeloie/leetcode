package arrays;

public class TeemoAttacking_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            result += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        result += duration;
        return result;
    }
}
