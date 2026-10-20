package Tree.Problems;

import Tree.Node;
import Tree.TreePrinter;
import Tree.TreeBuilder;

import java.util.*;

public class PathSum {
    public static void main(String[] args) {
        Integer[] arr = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        int target = 22;
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(pathSum(root,target));
    }
   public static List<List<Integer>> pathSum(Node root,int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root,target,path,result);
        return result;
   }
   private static void dfs(Node node, int remaining,List<Integer> path,List<List<Integer>> result){
        if(node == null) return;
        path.add(node.val);
        remaining -= node.val;
        if(node.left == null && node.right == null && remaining == 0){
            result.add(new ArrayList<>(path));
        }
        else{
            dfs(node.left, remaining, path, result);
            dfs(node.right, remaining, path, result);
        }
        path.remove(path.size() - 1);
   }
}
