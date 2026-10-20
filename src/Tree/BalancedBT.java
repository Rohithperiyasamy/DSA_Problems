package Tree;

public class BalancedBT {
    BalancedBT(){

    }
    class Node{
        private Node right;
        private Node left;
        int val;
        int height;
       Node(int val){
           this.val = val;
       }
        public int getVal(int val)
        {
            return val;
        }
    }
    private Node root;
    public void insert(int val){
        root = insert(val,root);

    }
    private Node insert(int val,Node node)
    {
        if(node == null) {
            node = new Node(val);
            return node;
        }
        if(val < node.val){
            node.left = insert(val,node.left);
        }
        if(val > node.val){
            node.right = insert(val,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 &&
                balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }



    private void populateSorted(int[] nums,int start,int end){
        if(start >= end) return ;
        int mid = start + (end - start) / 2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }
    public void display(){
        display(root,"the root is :");
    }
    private void display(Node node, String details)
    {
        if(node == null) return ;
        System.out.println(details+node.val);
        display(node.left,"Left child Of:" + node.val +":");
        display(node.right,"Right child Of:" + node.val+":");

    }
    //PreOrder Traversal
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        BalancedBT tree = new BalancedBT();
       // tree.populate(nums);
        //tree.populateSorted(nums);
        tree.display();
        tree.preOrder();
       boolean res =  tree.balanced();
        System.out.println(res);


    }

}
