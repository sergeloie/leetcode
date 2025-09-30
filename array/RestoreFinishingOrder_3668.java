package array;

import java.util.Arrays;

public class RestoreFinishingOrder_3668 {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int count = 0;

        for (int o : order) {
            int index = Arrays.binarySearch(friends, o);
            if (o == friends[index]) {
                result[count++] = o;
            }
        }
        return result;

    }
}
