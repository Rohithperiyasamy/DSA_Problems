package Tree.Problems;

import Tree.Node;

import java.util.*;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class LevelOrder {

    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};

        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(levelOrder(root));

    }

    public static List<List<Integer>> levelOrder(Node root) {
            // code here
            List<List<Integer>> result = new ArrayList<>();
            if(root == null) return result;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> currentLevel = new ArrayList<>();

                for(int i = 0; i < size; i++){
                    Node node = queue.poll();
                    currentLevel.add(node.val);

                    if(node.left != null) queue.offer(node.left);
                    if(node.right != null) queue.offer(node.right);
                }
                    result.add(currentLevel);
            }
            return result;
        }
}

