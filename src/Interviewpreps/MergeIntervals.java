package Interviewpreps;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };
        int[][] res = mergeInt(intervals);
        for (int[] arr : res)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] mergeInt(int[][] intervals) {
        List<int[]> resList = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int i = 0;

        while (i < intervals.length) {
            int newstart = intervals[i][0];
            int currEnd = intervals[i][1];

            while (i + 1 < intervals.length && currEnd >= intervals[i + 1][0]) {
                currEnd = Math.max(currEnd, intervals[i + 1][1]);
                i++;
            }
            resList.add(new int[]{newstart, currEnd});
            i++;
        }
        return resList.toArray(new int[resList.size()][]);
    }
}
