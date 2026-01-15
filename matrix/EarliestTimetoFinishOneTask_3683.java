package matrix;

public class EarliestTimetoFinishOneTask_3683 {
    public int earliestTime(int[][] tasks) {
        int result = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            result = Math.min(result, task[1] + task[0]);
        }
        return result;
    }
}
