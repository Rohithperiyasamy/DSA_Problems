package Interviewpreps;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.print(strgCompress(chars));

    }
    static int strgCompress(char[] chars)
    {
        int indx = 0;
        int start = 0;
        while(start < chars.length)
        {
            int end = start;
            while(end < chars.length && chars[start] == chars[end])
            {
                end++;
            }
            int count = end - start;
            chars[indx++] = chars[start];
            if(count >= 2)
            {
                char[] freq = Integer.toString(count).toCharArray();

                for(char ch : freq)
                {
                    chars[indx++] = ch;
                }
            }
            start = end;
        }
        return indx;
    }
}