package DynamicProgramming;


//https://leetcode.com/problems/partition-array-for-maximum-sum/

public class ArrayPartitionMaxsum {
    public static void main(String[] args) {
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k  = 3;
        System.out.println(arraypartionsum(arr,k));
    }
    static int arraypartionsum(int[] arr, int k)
    {
        int n = arr.length;
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++)
        {
            int currmax = 0;
            for(int len = 1; len <= Math.min(k,i); len++)
            {
                currmax = Math.max(currmax, arr[i - len]);
                dp[i] = Math.max(dp[i],
                        dp[i - len] + currmax * len);
            }
        }
        return dp[n];
    }
}
