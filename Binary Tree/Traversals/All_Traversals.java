
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
    public void InOrder(Node root) {
        if (root == null) {
            System.out.println("tree is empty");
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    //inorder iterative
    public ArrayList<Integer> InOrderIterative(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node curr = root;
        boolean done = false;
        while (!done) {
            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                if (s.isEmpty()) {
                    done = true;
                } else {
                    curr = s.pop();
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return list;
    }

    //postorder recursion
    public void PostOrder(Node root) {
        if (root == null) {
            System.out.println("tree is empty");
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    //postorder iterative
    public ArrayList<Integer> postOrderIterative(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            System.out.println("tree is empty");
        }
        Stack<Node> s = new Stack<>();
        s.push(root);
        Node prev = null;
        while (!s.isEmpty()) {
            Node curr = s.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null) {
                    s.push(curr.left);
                } else if (curr.right != null) {
                    s.push(curr.right);
                } else if (curr.left == prev) {
                    if (curr.right != null) {
                        s.push(curr.right);
                    }
                } else {
                    list.add(curr.data);
                    s.pop();
                }
                prev = curr;
            }
        }
        return list;
    }

    //levelorder iterative

    public ArrayList<ArrayList<Integer>> LevelOrder(Node root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> curr = new ArrayList<>();
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp != null) {
                curr.add(temp.data);
            }
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            } else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
                list.add(c_curr);
                curr.clear();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
    }
}
