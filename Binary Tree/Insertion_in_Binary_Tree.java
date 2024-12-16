
import java.util.LinkedList;
import java.util.Queue;

class Insertion_in_Binary_Tree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;
        }
    }

    //iterative
    public Node insertBinaryTreeLevelOrder(Node root,int data){
        if(root==null){
            return null;
        }
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp!=null){
                if(temp.left!=null){
                    q.offer(temp.left);
                }else{
                    temp.left = new Node(data);
                    return root;
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }else{
                    temp.right = new Node(data);
                    return root;
                }
            }
        }
        return root;
    }

    //recursive
    public void insertBinaryTreeRecursive(Node root,int data){
        if(root==null){
            root = new Node(data);
        }else{
            insertHelper(root,data);
        }
    }
    private void insertHelper(Node root, int data){
        if(root.data>=data){
            if(root.left==null){
                root.left = new Node(data);
            }else{
                insertHelper(root.left,data);
            }
        }else{
            if(root.right==null){
                root.right= new Node(data);
            }else{
                insertHelper(root.right, data);
            }
        }
    }
}