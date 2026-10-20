package Arrays;
import java.util.HashMap;
public class LongSubarraySumZero {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        int k = 0;
        System.out.println(longsumzero(nums,k));
    }
    static int longsumzero(int[] nums, int k)
    {
        int maxlen = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            if(sum == k)
            {
                maxlen = i+1;
            }
            if(map.containsKey(sum - k))
            {
                maxlen = Math.max(maxlen, i - map.get(sum - k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxlen;
    }
}
