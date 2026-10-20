package Greedy;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1,3,2,5};
        int[] end = {2,4,3,6};
        System.out.println(activity(start, end));
    }
    static int activity(int[] start, int[] end){
        int n = start.length;
        Integer[] idx = new Integer[n];
        for(int i = 0; i < n; i++){
            idx[i] = i;
        }
        // before idx is 0,1,2,3
        Arrays.sort(idx, (a,b) -> end[a] - end[b]);

        /// After idx is 0,2,1,3 = based on the end array , it sorted

        int count = 1;
        int lastEnd = end[idx[0]];
        for(int i = 1; i < n; i++){
            if(start[idx[i]] > lastEnd){
                count++;
                lastEnd = end[idx[i]];
            }
        }
        return count;
    }
}
