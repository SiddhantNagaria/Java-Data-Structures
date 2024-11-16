
import java.util.*;

class Searching_in_BinaryTree{
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

    // recursive
    public static boolean search(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        return search(root.left, data) || search(root.right, data);
    }

    // without recursion
    public boolean searchWithoutRecursion(Node root, int data){
        if(root == null){
            return false;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.data==data){
                return true;
            }
            if(temp!=null){
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }

        return false;
    }
}