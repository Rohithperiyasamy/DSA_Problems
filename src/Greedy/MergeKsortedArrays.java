package Greedy;
import java.util.*;
public class MergeKsortedArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,1,4},
                {5,6,7}
        };
        System.out.println(mergeKarr(arr));
    }
    static List<Integer> mergeKarr(int[][] arr){
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> a[0] - b[0]
        );
        int totalSize = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length > 0){
                pq.offer(new int[]{arr[i][0],i,0});
                totalSize += arr[i].length;
            }
        }
        List<Integer> ans = new ArrayList<>();

        int[] res = new int[totalSize];
        int idx = 0;
        while (!pq.isEmpty()){
            int curr[] = pq.poll();
            int val = curr[0];
            int row = curr[1];
            int col = curr[2];

            ans.add(val);
            if(col + 1 < arr[row].length){
                pq.offer(new int[]{arr[row][col+1],row,col+1});
            }
        }

        return ans;
    }
}
