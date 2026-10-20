package Java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintNonRepeatingChars {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(reverse(str));

    }

    //NonRepeats
    static List<Character> nonRepeatChar(String str) {
        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
        System.out.println(collect);

        List<Character> list = collect.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        return list;
    }

//Reverse the string 
    static String reverse(String str){
        String res = Stream.of(str.split(""))
                .reduce("",
                        (a,b) -> b+a);
        return res;
    }
}
