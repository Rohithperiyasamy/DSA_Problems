package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(LCS2(text1,text2));
    }

    //time complexity = o(m*n)
    //space complexity = o(m*n)
    static int LCS(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++)
        {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= n; j++)
        {
            dp[0][j] = 0;
        }
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    //Optimized approach
    // time complex = o(m*n)
    // space complex = o(n)

    static int LCS2(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int[] prev = new int[n+1];
        int[] curr = new int[n+1];
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j] = prev[j-1]+1;
                }
                else{
                    curr[j] = Math.max(prev[j], curr[j-1]);
                }
            }
            prev = curr;
            curr = new int[n+1];
        }
        return prev[n];
    }
}
