package Interviewpreps;
import java.util.*;

//Important for MAANGM

public class  MinimumWindowSubstrring {
    public static void main(String[] args) {
        String s = "timetopractice";
        String t = "toc";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t){
        HashMap<Character,Integer> freq = new HashMap<>();
        int start = 0;
        int right = 0, left = 0;
        int min = Integer.MAX_VALUE;
        int required = t.length();
        for(char c : t.toCharArray())
        {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        while(right < s.length())
        {
            char c = s.charAt(right);
            if(freq.containsKey(c))
            {
                if(freq.get(c) > 0)
                    required--;
                    freq.put(c, freq.get(c)-1);
            }
                right++;
                while(required == 0)
                {
                    if(right - left < min)
                    {
                        min = right - left;
                        start = left;
                    }
                    char leftChar = s.charAt(left);
                    if(freq.containsKey(leftChar))
                    {
                        freq.put(leftChar,freq.get(leftChar)+1);
                        if(freq.get(leftChar) > 0) required++;
                    }
                    left++;
                }
            }

        return min == Integer.MAX_VALUE ? "" : s.substring(start,start+min);
    }
}
