package DynamicProgramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = {1,2,3};
        int[] wt = {4,5,1};
        int W = 4;
        System.out.println(knapsackOptimized(val,wt,W));
    }
    static int knapsack(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i = 1; i <= n; i++){
            for(int w = 0; w <= W; w++){
                dp[i][w] = dp[i-1][w];
                if(wt[i-1] <= w){
                    int take = val[i-1] + dp[i-1][w - wt[i-1]];
                    dp[i][w] = Math.max(dp[i][w] , take);
                }
            }
        }
        return dp[n][W];
    }
    static int knapsackOptimized(int[] val, int[] wt, int W){
        int[] dp = new int[W+1];
        for(int i = 0; i < val.length; i++){
            for(int w = W; w >= wt[i]; w-- ){
                dp[w] = Math.max(dp[w],val[i] + dp[w - wt[i ]]);

            }
        }
        return dp[W];
    }

}
