package Interviewpreps;
import java.util.Arrays;
public class NonOverlap {
    public static void main(String[] args) {
        int[][] intervals = { {1, 2},
                              {2, 3},
                              {3, 4},
                              {1, 3}};
        System.out.print(EraseII(intervals));
    }
    static int Erase(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b) -> (a[0] - b[0]));
        int toRemove = 0;
        for(int i = 0; i < intervals.length; i++)
        {
            int currEnd = intervals[i][1];
            while(i+1 < intervals.length && currEnd > intervals[i+1][0])
            {
                toRemove++;
                currEnd = Math.min(currEnd, intervals[i+1][1]);
                i++;
            }
        }
        return toRemove;
    }

    static int EraseII(int[][] intervals){
     Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

    int count = 0;
    int lastEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
        if(intervals[i][0] < lastEnd){

            count++;
        } else {

            lastEnd = intervals[i][1];
        }
    }
        return count;
}
}


