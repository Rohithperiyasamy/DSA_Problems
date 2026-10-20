package Tree.Problems;

import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class ValidBST {
    public static void main(String[] args) {
        Integer[] arr = {2,1,3};
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(isValidBST(root));
    }
    public static boolean isValidBST(Node root){
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean check(Node node,long min, long max){
        if(node == null) return true;
        if(node.val <= min || node.val >= max){
            return false;
        }
        return check(node.left,min, node.val) && check(node.right, node.val, max);
    }
}
