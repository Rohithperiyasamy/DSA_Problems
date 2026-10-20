package String;

import java.util.HashSet;

public class LongestSubstringwithoutrepeat {
    public static void main(String[] args) {
        String s = "ababd";
        System.out.println(Longsub(s));
    }
    static int Longsub(String s)
    {
        HashSet<Character> res = new HashSet<>();
        int left = 0,maxlen = 0;
        for(int right = 0; right <= s.length()-1; right++)
        {
            while(res.contains(s.charAt(right)))
            {
                res.remove(s.charAt(left++));
            }
            res.add(s.charAt(right));
            maxlen = Math.max(maxlen,right - left + 1);
        }
        return maxlen;
    }
}
