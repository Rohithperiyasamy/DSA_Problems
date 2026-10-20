package DynamicProgramming;

import java.util.*;


public class WordBreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        String[] Dict = {"cat","cats","and","sand","dog"};
        System.out.println(wordBreakII(s, Dict));
    }
    static List<String> wordBreakII(String s, String[] Dict)
    {
        Set<String> set = new HashSet<>(Arrays.asList(Dict));
        Map<String, List<String>> memo = new HashMap<>();
        //List<String> res = dfs(s,set,memo);
       // return res.toArray(new String[0]);
        return dfs(s,set,memo);
    }
    private static List<String> dfs(String s,  Set<String> set,Map<String, List<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        List<String> result = new ArrayList<>();
        if(set.contains(s)){
            result.add(s);
        }
        for(int i = 1; i < s.length(); i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(set.contains(left)){
                List<String> rightPath = dfs(right,set,memo);
                for(String sent : rightPath){
                    result.add(left+" "+right);
                }
            }
        }
        memo.put(s,result);
        return result;
    }
}
