package Arrays;

import java.util.Stack;

public class RemoveAdjacent {
    public static void main(String[] args) {
        String s = "abbdac";
        System.out.print(remAdjcent(s));
    }
    static String remAdjcent(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char i : st){
            sb.append(i);
        }
        return sb.toString();
    }
}

