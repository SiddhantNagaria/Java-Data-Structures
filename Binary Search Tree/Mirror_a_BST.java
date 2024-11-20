
class Mirror_a_BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirror(Node root) {
        if(root == null){
            return null;
        }
        Node leftSubtree = mirror(root.left);
        Node rightSubtree = mirror(root.right);
        root.left = rightSubtree;
        root.right = leftSubtree;
        return root; 
    }
    public static void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {

    }
}
