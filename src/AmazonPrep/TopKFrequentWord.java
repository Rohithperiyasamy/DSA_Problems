package AmazonPrep;
import java.util.*;
public class TopKFrequentWord {
    public static void main(String[] args) {

        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.print(topFrequentWords(words,k));
    }
    static List<String> topFrequentWords(String[] words, int k){
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.merge(word,1,Integer::sum);
        }
        PriorityQueue<String> heap = new PriorityQueue<>((a,b) -> {
            int freq = map.get(a) - map.get(b);
            if(freq == 0){
                return b.compareTo(a);
            }
            return freq;
        });
        for(String s : map.keySet()){
            heap.offer(s);
            if(heap.size() > k){
                heap.poll();
            }
        }
        while(!heap.isEmpty()) {
            result.add(heap.poll());
        }
        return result.reversed();
    }
}
