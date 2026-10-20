package Hard_Probs;
import java.util.*;
public class MaximumSumSubarrayAfterKSwaps {
    public static void main(String[] args) {
        int[] arr = {1,-5,2,10};
        int k = 2;
        System.out.println(maxSubarraysumAfterswap(arr,k));
    }
    static Long maxSubarraysumAfterswap(int[] arr,int k){

        long ans = 0;
        for(int i = 0; i < arr.length; i++){

            for(int j = i; j < arr.length; j++){
                long currSum = 0;
                List<Integer> inside = new ArrayList<>();
                List<Integer> outside = new ArrayList<>();
                for(int x = 0; x < arr.length; x++){
                    if(x >= i && x <= j){
                        inside.add(arr[x]);
                        currSum += arr[x];

                    }
                    else{
                        outside.add(arr[x]);
                    }
                }
                Collections.sort(inside);
                outside.sort(Collections.reverseOrder());
                long newSum = currSum;
                int swaps = Math.min(k,Math.min(inside.size(), outside.size()));
                for(int s = 0; s < swaps;s++){
                    int in = inside.get(s);
                    int out = outside.get(s);
                    if(out > in){
                        newSum += (out - in);
                    }
                    else{
                        break;
                    }
                }
                ans = Math.max(ans,newSum);
            }
        }
        return ans;
    }

}
