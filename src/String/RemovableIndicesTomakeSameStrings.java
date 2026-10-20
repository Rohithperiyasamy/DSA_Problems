package String;
import java.util.*;
public class RemovableIndicesTomakeSameStrings {
    public static void main(String[] args) {
        String str1 = "abdgggcf";
        String str2 = "abdggcf";
        System.out.print(removableChar(str1,str2));
    }
    static List<Integer> removableChar(String str1, String str2){
        List<Integer> ans = new ArrayList<>();
        int n = str1.length();
        int m = str2.length();
        int[] res = new int[n];
        if(n != m+1){
            ans.add(-1);
            return ans;
        }
        boolean[] prefix = new boolean[m+1];
        boolean[] suffix = new boolean[m+1];
        prefix[0] = true;
        for(int i = 0; i < m; i++){
            prefix[i+1] = prefix[i] & (str1.charAt(i) == str2.charAt(i));
        }
        suffix[m] = true;
        for(int i = m-1; i >= 0; i--){
            suffix[i] = suffix[i+1] & (str1.charAt(i+1) == str2.charAt(i));
        }
        for(int k = 0; k < n; k++){
            if(prefix[k] && suffix[k]){
                ans.add(k);
            }
        }
        return ans;
    }
}
