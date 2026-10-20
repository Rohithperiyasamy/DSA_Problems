package Tree.Problems;

import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class CountMaxNode {
    public static void main(String[] args) {
        Integer[] arr = {3,1,4,3,null,1,5};
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(goodNodes(root));
    }
    public static int goodNodes(Node root) {
        return dfs(root, root.val);
    }
    private static int dfs(Node node, int maxSoFar){
        if(node == null ) return 0;
        int count  = 0;
        if(node.val >= maxSoFar){
            count = 1;
            maxSoFar = node.val;
        }
        return count + dfs(node.left,maxSoFar) + dfs(node.right,maxSoFar);
    }
}