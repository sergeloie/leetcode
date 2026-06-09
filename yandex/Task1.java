package yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public int calcWater() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        int[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int t = arr[0];
        result += arr[1];
        for (int i = 1; i < n; i++) {
            arr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            result = Math.max(result - (arr[0] - t), 0);
            result += arr[1];
            t = arr[0];
        }
        return result;
    }

    public String maximize(String a, String b) {
        List<Integer> aList = Arrays.stream(a.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> bList = Arrays.stream(b.split(""))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .toList();
        int aCount = 0;
        int bCount = 0;
        while (aCount < aList.size() && bCount < bList.size()) {
            if (aList.get(aCount) < bList.get(bCount)) {
                aList.set(aCount, bList.get(bCount));
                bCount++;
            }
            aCount++;
        }
        return aList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
