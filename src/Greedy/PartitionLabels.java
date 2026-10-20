package Greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    static void main() {
        String s = "ababcbacadefegdehijhklij";
        System.out.print(partitionLabels(s));
    }
    static List<Integer> partitionLabels(String s){
        ArrayList<Integer> result = new ArrayList<>();
        int[] lastInd = new int[26];
        for(int i = 0; i < s.length();i++){
            lastInd[s.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, lastInd[s.charAt(i) - 'a'] );
            if(i ==  end){
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
