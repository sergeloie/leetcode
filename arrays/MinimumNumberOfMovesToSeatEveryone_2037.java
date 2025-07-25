package arrays;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < students.length; i++) {
            result += Math.abs(students[i] - seats[i]);
        }
        return result;
    }
}
