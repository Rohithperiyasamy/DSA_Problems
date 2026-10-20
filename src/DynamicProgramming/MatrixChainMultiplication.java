package DynamicProgramming;

public class MatrixChainMultiplication {
    public static void main(String[] args){
        int[] arr = {10, 30, 5, 60};
        System.out.println(matrixChain(arr));
    }
    static int matrixChain(int[] arr){
        int n = arr.length-1;
        int[][] dp = new int[n][n];

        for(int gap = 1; gap < n; gap++){
            for(int  i = 0; i < n - gap; i++){
                int j = i + gap;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int cost = dp[i][k]+dp[k+1][j]+arr[i]*arr[k+1]*arr[j+1];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[0][n-1];
    }
}
