package Tree.Problems;

import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class RangeSumBST {
    public static void main(String[] args) {
        Integer[] arr = {10,5,15,3,7,13,18,1,null,6};
        int low = 6;
        int high = 10;
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(rangeSumBST(root,low,high));
    }
    public static int rangeSumBST(Node root, int low, int high) {
        if(root == null) return 0;
        if(root.val < low){
            return rangeSumBST(root.right,low,high);
        }
        if(root.val > high){
            return rangeSumBST(root.left,low,high);
        }
        return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}

