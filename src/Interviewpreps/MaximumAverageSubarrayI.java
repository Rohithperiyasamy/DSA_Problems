package Interviewpreps;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.print(MaxAverage(nums,k));
    }

    static double MaxAverage(int[] nums, int k)
    {
        int curr_sum = 0;
        int max = 0;
        for(int i = 0; i < k; i++)
        {
            curr_sum += nums[i];
        }
        max = curr_sum;
        for(int i = k; i < nums.length; i++)
        {
            curr_sum = curr_sum + nums[i] - nums[i-k];
            if(curr_sum > max)
            {
                max = curr_sum;
            }
        }
        return (double)max / k;
    }
}
