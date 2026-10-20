package String;

import java.util.Stack;

public class RemoveCharBeforeSymbol {
    static void main() {
        String s = "ineeded**jobs*now";
        System.out.print(removeChar(s));

    }
    static String removeChar(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char i : stack){
            sb.append(i);
        }
        return sb.toString();
    }
}
