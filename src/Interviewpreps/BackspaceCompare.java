package Interviewpreps;

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        BackspaceCompare obj = new BackspaceCompare();
        boolean res = obj.backspace(s,t);
        System.out.println(res);
    }
    private String convert(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()) {
            if (i != '#') {
                stack.push(i);
            } else {
                if (!stack.isEmpty())
                    stack.pop();
            }
        }
            String ans = "";
            for(Character i : stack)
            {
                ans += i;
            }
            return ans;

    }
    public boolean backspace(String s, String t)
    {
        String a = convert(s), b = convert(t);
        return a.equals(b);
    }
}
