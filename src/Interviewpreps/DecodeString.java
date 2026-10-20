package Interviewpreps;
import java.util.Stack;
//Zoho Interview Question

public class DecodeString {
    public static void main(String[] args) {
        String s = "2[a]3[bc]";
        System.out.print(decodingstr(s));
    }
    public static String decodingstr(String s)
    {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num = num * 10 + (c - '0');
            }
            else if(c == '[')
            {
                numStack.push(num);
                strStack.push(ans);
                ans = new StringBuilder();
                num = 0;
            }
            else if(c == ']')
            {
                String str = ans.toString();
                ans = new StringBuilder(str.repeat(numStack.pop()));
                ans = strStack.pop().append(ans);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
