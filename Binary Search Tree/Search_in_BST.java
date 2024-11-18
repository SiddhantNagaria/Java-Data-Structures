
class Search_in_BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //left subtree
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);

        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 2, 4, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        if (search(root, 5)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        System.out.println();
    }
}
