
class Delete_a_Node_in_BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }
        if (root.data > val) {
            root.left = createBST(root.left, val);
        } else {
            root.right = createBST(root.right, val);
        }

        return root;
    }

    public static Node deleteNode(Node root, int val) {
        if (root.data < val) {
            root.right = deleteNode(root.right, val);
            return null;
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {
            //case 1 : no child
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2 : one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case 3 - both child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            deleteNode(root.right, IS.data);
        }
        return root;
    }


    public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5, 4, 2, 6, 1, 7, 3, 8};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        deleteNode(root, 4);
        System.out.println();
        inOrder(root);
    }
}
