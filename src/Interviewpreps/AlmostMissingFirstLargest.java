package Interviewpreps;
import java.util.*;
public class AlmostMissingFirstLargest {
    static void main() {
        int[] nums = {3,9,2,1,7};
        int k = 3;
        System.out.println(almostMissingLargest(nums,k));
    }
    static int almostMissingLargest(int[] nums, int k){

        Map<Integer,Integer> freq = new HashMap<>();
        Map<Integer,Integer> window = new
                HashMap<>();
        for(int i = 0; i < k; i++){
            freq.merge(nums[i],1,Integer::sum);
        }
        for(int num : freq.keySet()){
            window.merge(num,1,Integer::sum);
        }
        for(int right = k; right < nums.length; right++) {
            int leftnum = nums[right - k];
            freq.merge(leftnum, -1, Integer::sum);
            if (freq.get(leftnum) == 0) {
                freq.remove(leftnum);
            }
            freq.merge(nums[right], 1, Integer::sum);
            for (int num : freq.keySet()) {
                window.merge(num, 1, Integer::sum);
            }
        }
        int ans = -1;
            for(Map.Entry<Integer,Integer> e : window.entrySet()){
                if(e.getValue() == 1){
                    ans = Math.max(ans,e.getKey());
                }

        }
        return ans;
    }

}
