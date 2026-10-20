package DynamicProgramming;

public class DecodeWays {
    public static void main(String[] args) {
        String s = "121";
        System.out.println(decodeway(s));
    }
    static int decodeway(String s){
        int n = s.length();

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        if(s == null ||s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        for(int i = 2; i <= n; i++)
        {
            int single = s.charAt(i-1) - '0';
            if(single >= 1){
                dp[i] += dp[i-1];
            }
            int two = (s.charAt(i-2) - '0') * 10
                    + (s.charAt(i-1) - '0');
            if(two >= 10 && two <= 26){
                dp[i] += dp[i-2];

            }
        }
        return dp[n];
    }
}
