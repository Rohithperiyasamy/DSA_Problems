package Interviewpreps;

import java.util.*;

public class MeetingRooms {
    public static void main(String[] args) {
        int[][] intervals = {
                {0,30},{5,10},{15,20}
        };
        System.out.println(meeting(intervals));
    }
    static int meeting(int[][] intervals)
    {
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.offer(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start >= minheap.peek()){
                minheap.poll();
            }
            minheap.offer(end);
        }
        return minheap.size();

    }

}
