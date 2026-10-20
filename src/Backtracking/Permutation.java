package Backtracking;

import java.util.*;

public class Permutation {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.print(permutation(nums));
    }
    static List<List<Integer>> permutation(int[] nums){
        backtrack(nums,new ArrayList<>(),new boolean[nums.length]);
        return result;
    }
    private static void backtrack(int[] nums, List<Integer> current, boolean[] used){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums,current,used);
            used[i] = false;
            current.remove(current.size()-1);
        }
    }
}
