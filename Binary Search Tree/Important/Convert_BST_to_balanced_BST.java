
import java.util.ArrayList;

class Convert_BST_to_balanced_BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void preOrder(Node root){
        if(root == null){
            System.out.println("Tree is empty");
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }
    public static Node balanceBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder -> balanced BST
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(10);
        root = balanceBST(root);
        preOrder(root);
    }
}