package Interviewpreps;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,0,1,1};
        int k = 3;
        System.out.println(maxOnes(nums,k));
    }
    static int maxOnes(int[] nums, int k)
    {
        int start = 0;
        int maxcount = 0;
        int zeros = 0;
        for(int end = 0; end < nums.length; end++)
        {
            if(nums[end] == 0)
            {
                zeros++;
            }
            while(zeros > k)
            {
                if(nums[start] == 0)
                {
                    zeros--;
                }
                start++;
            }
            maxcount = Math.max(maxcount, end - start + 1);
        }
        return maxcount;
    }
}
