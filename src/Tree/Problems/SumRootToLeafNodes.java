package Tree.Problems;
import Tree.Node;
import Tree.TreeBuilder;
import Tree.TreePrinter;

//example: input = 1,2,3
//        1 -> 2  = 12,
//        1 -> 3 = 13
//12+13 = 25
//output = 25
public class SumRootToLeafNodes {
    public static void main(String[] args) {
        Integer[] arr = {4,9,0,5,1};
        Node root = TreeBuilder.build(arr);
        TreePrinter.printLevelOrder(root);
        TreePrinter.printTree(root);
        System.out.print(sumRoot(root));

    }
    public static int sumRoot(Node root){
        return dfs(root, 0);
    }
    private static int dfs(Node node,int currentNum){
        if(node == null) return 0;
        currentNum = currentNum * 10 + node.val;
        if(node.left == null && node.right == null){
            return currentNum;
        }

        return dfs(node.left,currentNum) + dfs(node.right,currentNum);
    }
}
