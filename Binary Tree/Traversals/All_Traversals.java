
import java.util.ArrayList;
import java.util.Stack;

class All_Traversals {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    //preorder recursion
    public void PreOrder(Node root) {
        if (root == null) {
            System.out.println("tree is empty");
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);

    }

    //preorder iterative
    public ArrayList<Integer> PreOrderIterative(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> s = new Stack<Node>();
        s.push(root);
        while (!s.isEmpty()) {
            Node temp = s.pop();

            list.add(temp.data);
            if (temp.right != null) {
                s.push(temp.right);
            }
            if (temp.left != null) {
                s.push(temp.left);
            }
        }
        return list;
    }
    
    //inorder recursion
    
    
    public static void main(String[] args) {    
   }
}