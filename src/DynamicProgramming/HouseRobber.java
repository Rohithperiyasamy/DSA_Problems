package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int nums[] = {2,3,2};
        System.out.println(maxRobs(nums));
    }
    static int maxRobs(int[] nums)
    {
        int n = nums.length-1;
        if(n == 0) return 0;
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        for(int i = 2; i <= n; i++)
        {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
