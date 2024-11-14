class Transform_to_subtree{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int left = transform(root.left);
        int right = transform(root.right);
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + left + right + newRight;
        return data;
    }
    public static void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transform(root);
        PreOrder(root);
    }
}