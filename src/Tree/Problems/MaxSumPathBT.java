package Tree.Problems;
import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

public class MaxSumPathBT {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Integer[] arr = {-10, 9, 20, null, null, 15, 7};
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        maxSum = Integer.MIN_VALUE;
        maxGain(root);

        System.out.print(maxSum);

    }
    private static int maxGain(Node root){
        if(root == null) return 0;
        int leftgain = Math.max(maxGain(root.left),0);
        int rightgain = Math.max(maxGain(root.right),0);
        int pathSum = root.val + leftgain + rightgain;
        maxSum = Math.max(pathSum,maxSum);
        return root.val+ Math.max(leftgain,rightgain);
    }
}
