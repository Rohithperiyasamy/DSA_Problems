package DynamicProgramming;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "bbbabcd";
        System.out.println(LPS2(s));
    }
    static String LPS(String s)
    {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxlen = 1;
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }
        for(int i = 0; i < n-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxlen = 2;
            }
        }
        for(int len = 3; len <= n; len++)
        {
            for(int i = 0; i <= n - len; i++)
            {
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] ){
                    dp[i][j] = true;
                    if(len > maxlen)
                    {
                        start = i;
                        maxlen = len;
                    }
                }
            }
        }
    return s.substring(start, start + maxlen);
    }


    static int LPS2(String s)
    {
        int n  = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            dp[i][i] = 1;
        }
        for(int len = 2; len <= n; len++){
            for(int i = 0; i <= n-len; i++)
            {
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j))
                {
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
