package Tree.Problems;
import java.util.*;
import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class ZigZagTree {
    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};

        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(zigZag(root));
    }
    public static List<List<Integer>> zigZag(Node root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean LeftToRight = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                if(LeftToRight){
                    currentLevel.add(node.val);
                }
                else{
                    currentLevel.addFirst(node.val);
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(currentLevel);
            LeftToRight = !LeftToRight;
        }
        return result;
    }
}
