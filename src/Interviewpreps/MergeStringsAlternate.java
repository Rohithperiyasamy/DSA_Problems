package Interviewpreps;

public class MergeStringsAlternate  {
    public static void main(String[] args) {
        String s1 = "rohith";
        String s2 = "software";
        System.out.print(alternatestring(s1,s2));
    }
    static String alternatestring(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        int min = Math.min(len1,len2);
        String longestStr = "";
        if(min == len1)
        {
            longestStr = s2;
        }
        if(min == len2)
        {
            longestStr = s1;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < min; i++)
        {
            sb.append(str1[i]);
            sb.append(str2[i]);
        }
        sb.append(longestStr.substring(min));
        return sb.toString();
    }
}
