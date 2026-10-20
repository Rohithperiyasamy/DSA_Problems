package Tree;
import java.util.*;
public class TreePrinter {
    public static void printLevelOrder(Node root){
        if(root == null){
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print("Level order: ");
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.val + " ");
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        System.out.println();
    }

    // Print inorder (left→root→right)
    public static void printInorder(Node root){
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    private static void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    // Print visual tree structure
    public static void printTree(Node root){
        printTree(root, "", true);
    }

    private static void printTree(Node node, String prefix, boolean isLeft){
        if(node == null) return;
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);
        printTree(node.left,  prefix + (isLeft ? "│   " : "    "), true);
        printTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
    }
}


