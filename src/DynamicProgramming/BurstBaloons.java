package DynamicProgramming;


public class BurstBaloons {
    public static void main(String[] args) {
        int[] nums = {3,1,5,8};
        System.out.println(burstBaloon(nums));
    }
    static int burstBaloon(int[] nums){
        int n = nums.length;
        int[] arr = new int[n+2];
        for(int i = 0; i < n; i++){
            arr[i+1] = nums[i];
        }
        arr[0] = 1;
        arr[n+1] = 1;
        int size = n+2;
        int[][] dp = new int[size][size];
        for(int gap = 2; gap < size; gap++){
            for(int i = 0; i < size - gap; i++){
                int j = i + gap;
                for(int k = i + 1; k < j; k++){
                    int coins = dp[i][k]+dp[k][j]+arr[i]*arr[k]*arr[j];
                    dp[i][j] = Math.max(dp[i][j], coins);
                }
            }
        }
        return dp[0][size-1];
    }


}
