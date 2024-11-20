
import java.util.ArrayList;

class Root_to_leaf_path{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            for(int i = 0; i<path.size(); i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println("Null");
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);

    }
}