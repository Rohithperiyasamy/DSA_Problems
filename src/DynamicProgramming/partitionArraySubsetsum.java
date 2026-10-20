package DynamicProgramming;

public class partitionArraySubsetsum {
    public static void main(String[] args) {
        int[] nums = {1,5,5,11};
        System.out.println(Arraysubsetparttion(nums));
    }
    static boolean Arraysubsetparttion(int[] nums)
    {
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum += num;
        }
        int target = totalsum / 2;
        boolean[] dp = new boolean[target+1];
        if(totalsum % 2 != 0) return false;
        dp[0] = true;
        for(int num : nums)
        {
            for(int s = target; s >= num; s--)
            {
                if(dp[s-num]){
                    dp[s] = true;
                }
            }
        }
        return dp[target];
    }
}
