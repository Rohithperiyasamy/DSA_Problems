package Arrays;
import java.util.HashSet;
public class LongestConsecSubsequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,2,1};
        System.out.println(LongestLengthofSequence(nums));
    }
    static int LongestLengthofSequence(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        int longest = 0;
        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current = num;
                int len = 1;
                while(set.contains(current+1))
                {
                    current++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
