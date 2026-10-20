package SlidingWindow;
import java.util.*;
public class SubarraywithKdiffInteger {
    static void main() {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(subarrayKdiffInts(nums,k));
    }
    static int subarrayKdiffInts(int[] nums,int k){
        return atmost(nums,k) - atmost(nums,k-1);
    }
    static int atmost(int[] nums, int k){
        int left = 0,count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            freq.merge(nums[right],1,Integer::sum);
            while(freq.size() > k){
                freq.merge(nums[left],-1,Integer::sum);
                if(freq.get(nums[left]) == 0){
                    freq.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
