import java.util.HashSet;

public class SumInterval {
    public static int sumIntervals(int[][] intervals) {
        HashSet<Integer> set = new HashSet<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            for (int j = start + 1; j <= end; j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}
