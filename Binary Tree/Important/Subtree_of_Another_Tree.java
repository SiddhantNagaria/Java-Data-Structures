
public class Subtree_of_Another_Tree {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
        // return node.data == subroot.data && isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }

    public static boolean isSubtree(Node root1, Node subroot) {
        if (root1 == null) {
            return false;
        }
        if (root1.data == subroot.data) {
            if (isIdentical(root1, subroot)) {
                return true;
            }
        }
        return isSubtree(root1.left, subroot) || isSubtree(root1.right, subroot);
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println("Is subtree " + isSubtree(root1, subroot));
    }
}
