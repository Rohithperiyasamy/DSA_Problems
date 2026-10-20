package Interviewpreps;

import java.util.HashMap;

//https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/

public class MinimumSwapstomakeEqualElementsAdjacent {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2};
        System.out.println(minSwapsmakeEqual(arr));

    }
    static int minSwapsmakeEqual(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.merge(x,1,Integer::sum);
        }
        int ans = Integer.MAX_VALUE;
        int maxCount = 0;
        for(int value : freq.keySet()){
            int k = freq.get(value);
            int count = 0;

            for(int i = 0; i < k; i++){
                if(arr[i] == value){
                    count++;
                }

            }
            maxCount = count;
            for(int i = k; i < n; i++){
                if(arr[i] == value) count++;
                if(arr[i-k] == value) count--;
                maxCount = Math.max(maxCount,count);
            }
            ans = Math.min(ans, k - maxCount);

        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
