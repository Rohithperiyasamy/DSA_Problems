package Tree.Problems;

import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class LowestCommonAncester {
    public static void main(String[] args) {
        Integer[] arr  = {3,5,1,6,2,0,8,null,null,7,4};
        int p = 5,q = 4;
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        lcs(root,p,q);
    }
    public static Node lcs(Node root,int p, int q){
        if(root == null) return null;
        if(root.val == p || root.val == q) return root ;
        Node left = lcs(root.left,p,q);
        Node right = lcs(root.right,p,q);
        if(left != null && right != null) return root;

        return left != null ? left : right;

    }
}