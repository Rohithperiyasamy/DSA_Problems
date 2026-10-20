package DynamicProgramming;

public class BooleanParenthesis {
    public static void main(String[] args) {
        String s = "T|T&F^T";
        System.out.println(booleanParen(s));
    }
    static int booleanParen(String s){
        StringBuilder sym = new StringBuilder();
        StringBuilder ops = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                sym.append(s.charAt(i));
            }
            else{
                ops.append(s.charAt(i));
            }
        }
        int n = sym.length();
        int[][][] dp = new int[n][n][2];
        for(int i = 0; i < n ; i++){
            dp[i][i][1] = sym.charAt(i) == 'T' ? 1 : 0;
            dp[i][i][0] = sym.charAt(i) == 'F' ? 1 : 0;
        }
        for(int gap =  1; gap < n; gap ++){
            for(int i = 0; i < n - gap; i++){
                int j =  i + gap;
                for(int k =  i; k < j; k++){
                    int lt = dp[i][k][1];
                    int lf = dp[i][k][0];
                    int rt = dp[k+1][j][1];
                    int rf = dp[k+1][j][0];

                    char c = ops.charAt(k);
                    if(c == '&'){
                        dp[i][j][1] += lt * rt;
                        dp[i][j][0] += lt * rf + lf * rt + lf * rf;
                    }
                    else if(c == '|'){
                        dp[i][j][1] += lt * rt + lf * rt + lt * rf;
                        dp[i][j][0] += lf * rf;
                    }
                    else if(c == '^'){
                        dp[i][j][1] += lt * rf + lf * rt;
                        dp[i][j][0] += lt * rt + lf * rf;
                    }
                }
            }
        }
        return dp[0][n-1][1];
    }
}
