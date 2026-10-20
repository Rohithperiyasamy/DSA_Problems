package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class  groupAnagramOptimized
{
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anaGram(str));
    }
    public static List<List<String>> anaGram(String[] str)
    {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : str)
        {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
