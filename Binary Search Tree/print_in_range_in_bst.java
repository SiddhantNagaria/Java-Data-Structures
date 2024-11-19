
class print_in_range_in_bst {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        }
        else if(root.data <k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {

    }
}
