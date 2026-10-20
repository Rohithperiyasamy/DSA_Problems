package Tree.Problems;

import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class HouseRobberIII {
    public static void main(String[] args) {
        Integer[] arr = {3,2,3,null,3,null,1};
        Node root = TreeBuilder.build(arr);

        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        int res = Robber(root);
        System.out.println();
        System.out.println(res+" ");
    }
    public static int Robber(Node root){
        int[] res = helper(root);
        return Math.max(res[0],res[1]);

    }
    private static int[] helper(Node root){
        if(root == null) return new int[] {0,0};
        int left[] = helper(root.left);
        int right[] = helper(root.right);
        int rob = root.val+left[0]+right[0];
        int skip = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        return new int[]{skip,rob};
    }
}
