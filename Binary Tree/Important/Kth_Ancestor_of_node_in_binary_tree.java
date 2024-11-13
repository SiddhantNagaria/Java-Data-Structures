class Kth_Ancestor_of_node_in_binary_tree{
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int KthAncestor(Node root, int n, int k){
       if(root.data==n){
        return 0;
       } 
       int left = KthAncestor(root.left, n, k);
       int right = KthAncestor(root.right, n, k);
       if(left==-1 && right == -1){
        return -1;
       }
       int max = Math.max(left,right);
       if(max+1==k){
        System.out.println(root.data);
       }
       return max+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n= 5, k=2;
        KthAncestor(root, n, k);
    }
}