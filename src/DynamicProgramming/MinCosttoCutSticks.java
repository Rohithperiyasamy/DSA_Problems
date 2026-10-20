package DynamicProgramming;
import java.util.*;
public class MinCosttoCutSticks {
    public static void main(String[] args) {
        int[] cuts = {2,4,7};
        int n = 10;
        System.out.println(minCostCutSticks(cuts,n));
    }
    static int minCostCutSticks(int[] cuts, int n){
        int m =  cuts.length;
        int[] arr = new int[m+2];
        arr[0] = 0;
        arr[m+1] = n;
        for(int i = 0; i < m; i++){
            arr[i+1] = cuts[i];
        }
        Arrays.sort(arr);
        int size = arr.length;
        int[][] dp = new int[size][size];
        for(int gap = 2; gap < size; gap++){
            for(int i = 0; i < size - gap; i++){
                int j = i+gap;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i + 1; k < j; k++){
                    int coins = dp[i][k]+
                            dp[k][j]+arr[j] - arr[i];
                    dp[i][j] = Math.min(dp[i][j], coins);
                }
            }
        }
        return dp[0][size-1];
    }
}
