package DynamicProgramming;

public class CombinationSumIV {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(combinationsum(nums,target));
    }
    static int combinationsum(int[] nums, int target)
    {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= target; i ++){
            for(int num : nums){
                if(num <= i){
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
