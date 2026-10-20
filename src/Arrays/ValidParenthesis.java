package Arrays;
import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args)
    {
        String s = "{()}";
        System.out.print(valid(s));
    }
    static boolean valid(String s)
    {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
           if(c == '{')
           {
               st.push('}');
           }
           else if(c == '(')
           {
               st.push(')');
           }
           else if(c == '[')
           {
               st.push(']');
           }
           else if(st.isEmpty() || st.pop() != c)
           {
               return false;
           }
        }
        if(!st.isEmpty())
        {
            return false;
        }
        return true;
    }
}
