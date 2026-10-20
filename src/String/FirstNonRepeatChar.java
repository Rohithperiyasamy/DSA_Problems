package String;

import java.util.HashMap;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
            String s = "swiss";
            char res = firstchar(s);
        if(res == '\0')
        {
            System.out.println("-1");
        }
        else {
            System.out.println(res);
        }

    }
    static char firstchar(String s)
    {
        HashMap<Character, Integer> c = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            c.put(ch, c.getOrDefault(ch,0) + 1);
        }
        for(HashMap.Entry<Character,Integer> entry : c.entrySet())
        {
            if(entry.getValue() == 1 ){
                return entry.getKey();
            }
        }
        return '\0';
    }
}
