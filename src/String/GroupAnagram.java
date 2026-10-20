package String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Group(str));
    }

    public static List<List<String>> Group(String[] str) {
        if (str == null || str.length == 0) return null;
        int[] primes = {2, 3, 5, 7, 11, 13, 17,
                19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83,
                89, 97, 101, 103};
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String word : str) {
            int prod = 1;
            for (int i = 0; i < word.length(); i++) {
                prod *= primes[word.charAt(i) - 'a'];
            }
            if (map.containsKey(prod)) {
                map.get(prod).add(word);
            } else {
                map.put(prod, new ArrayList<>());
                map.get(prod).add(word);
            }
            //map.computeIfAbsent(prod,k -> new ArrayList<>()).add(word);

        }
        return new ArrayList<>(map.values());

    }
}
