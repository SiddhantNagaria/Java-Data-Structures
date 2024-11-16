
import java.util.*;

class Maximum_Element_in_Binary_Tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //recursive
    public static int maxElement(Node root) {
        int max = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = maxElement(root.left);
            int rightMax = maxElement(root.right);
            if (leftMax > rightMax) {
                max = leftMax;
            } else {
                max = rightMax;
            }
            if (root.data > max) {
                max = root.data;
            }
        }
        return max;
    }

    //without recursion
    public static int maxElementWithoutRecursion(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp.data > max) {
                max = temp.data;
            }
            if (temp != null) {
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        return max;
    }
}
