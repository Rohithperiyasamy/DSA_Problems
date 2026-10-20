package Arrays;
import java.util.HashMap;
// it is a Problem where to find the longest or largest subarray with given sum k

public class LongestSubarraySumK {
    public static void main(String[] args)
    {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 10;
        System.out.println(Longsubsum(arr,k));
    }
    // Its a Optimized approach contains O(n) time and space complexity
    static int Longsubsum(int[] arr, int k)
    {
        int sum = 0;
        int maxlen = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(sum == k)
            {
                maxlen = i + 1;
            }
            if(mp.containsKey(sum-k))
            {
                maxlen = Math.max(maxlen, i - mp.get(sum-k));
            }
            mp.putIfAbsent(sum,i);
        }
        return maxlen;
    }
}
