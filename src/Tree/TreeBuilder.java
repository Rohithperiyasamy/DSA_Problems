package Tree;

import java.util.*;

public class TreeBuilder {
    public static Node build(Integer[] arr){
        if(arr == null || arr.length == 0 || arr[0] == null) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while(!queue.isEmpty() && i < arr.length){
            Node node = queue.poll();

            // Left child
            if(i < arr.length){
                if(arr[i] != null){
                    node.left = new Node(arr[i]);
                    queue.offer(node.left);
                }
                i++;
            }

            // Right child
            if(i < arr.length){
                if(arr[i] != null){
                    node.right = new Node(arr[i]);
                    queue.offer(node.right);
                }
                i++;
            }
        }
        return root;
    }
}