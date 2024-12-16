
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Reverse_Level_Order_Traversal{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.left=null;
            this.right = null;
        }
    }
    public static void ReverseLevelOrder(Node root){
        if(root==null){
            return;
        }
        Stack <Node> s= new Stack<Node>(); 
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp!=null){
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            s.push(temp);
        }
        while(!s.isEmpty()){
            System.out.println(s.pop().data + " ");
        }
    }
}