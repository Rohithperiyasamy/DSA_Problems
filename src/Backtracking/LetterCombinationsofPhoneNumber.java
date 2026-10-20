package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofPhoneNumber {
    private static final String[] MAP = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public static void main(String[] args) {
        String digits = "23";

        List<String> result = letterCombinations(digits);

        System.out.println(result);
    }
    static List<String> letterCombinations(String digits){
        if(digits == null || digits == "") return null;
        List<String> res = new ArrayList<>();
        backtrack(digits,0,new StringBuilder(),res);

return res;
    }
    static void backtrack(String digits,int index,StringBuilder current, List<String> res){
        if(index == digits.length()){
            res.add(current.toString());
            return;
        }
        String letters = MAP[digits.charAt(index) - '0'];
        for(char ch : letters.toCharArray()){
            current.append(ch);
            backtrack(digits,index+1,current,res);
            current.deleteCharAt(current.length()-1);
        }
    }
}
