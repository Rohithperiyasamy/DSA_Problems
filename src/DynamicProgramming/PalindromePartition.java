package DynamicProgramming;
import java.util.*;
public class PalindromePartition {
    public static void main(String[] args) {
        String s = "abcbac";
        System.out.println(partition(s));
    }
    static List<List<String>> partition(String s) {
        int n = s.length();
        List<String> path = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        boolean[][] isPalin = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                isPalin[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i <= 2 || isPalin[i + 1][j - 1]);
            }
        }
        backtrack(0, s, isPalin, path, ans);
        return ans;
    }
    public static void backtrack(int start, String s, boolean[][] isPalin,
                                 List<String> path, List<List<String>> ans){
        if(start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int end = start; end < s.length(); end++){
            if(isPalin[start][end]){
                path.add(s.substring(start, end+1));
                backtrack(end+1,s,isPalin,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    static int partitionII(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = n-1; i >= 0; i--)
        {
            for(int j = i; j < n; j++)
            {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i <= 2 || dp[i+1][j-1]);
            }
        }
        int[] cuts = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(dp[0][i]){
                cuts[i] = 0;
                continue;
            }
            cuts[i] = i;
             for(int j = 1; j <= i; j++){
                if(dp[j][i]){
                    cuts[i] = Math.min(cuts[i], cuts[j-1]+1);
                }
            }
        }
        return cuts[n-1];
    }
}

