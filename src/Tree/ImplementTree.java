package Tree;
import java.util.Scanner;
class ImplementTree{
    ImplementTree(){

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        private Node root;
        public void populate(Scanner sc ){
            System.out.println("Enter the Node:");
            int value = sc.nextInt();
            root = new Node(value);
            populate(sc,root);
        }
        private void populate(Scanner sc, Node node) {
            System.out.println("Do u want to insert left of node:" + node.value);
            boolean left = sc.nextBoolean();
            if (left) {
                System.out.println("Enter the left value:");
                int value = sc.nextInt();
                node.left = new Node(value);
                populate(sc, node.left);
            }
            System.out.println("Do u want to insert at right of :" + node.value);
            boolean right = sc.nextBoolean();
            if (right) {
                System.out.println("Enter the node for right:");
                int value = sc.nextInt();
                node.right = new Node(value);
                populate(sc, node.right);
            }

        }
        public void display(){
            display(root,"");
        }
        private void display(Node node, String indent)
        {
            if(node == null) return;
            System.out.println(indent+node.value);
            display(node.left,indent + '\t');
            display(node.right,indent+'\t');
        }


        //Maximum depth of BT
        static int maxDepth(Node root){
            if(root == null) return 0;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left,right);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ImplementTree tree = new ImplementTree();
            tree.populate(sc);
            tree.display();
            int res = tree.maxDepth(tree.root);
            System.out.println("Maximum depth of this Binary Tree is:"+res);
        }

    }
