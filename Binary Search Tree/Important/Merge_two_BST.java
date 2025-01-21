
import java.util.ArrayList;

class Merge_two_BST{
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

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        
        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //step3
        int i = 0 , j=0;
        ArrayList<Integer> FinalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                FinalArr.add(arr1.get(i));
                i++;
            }else{
                FinalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            FinalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            FinalArr.add(arr2.get(j));
            j++;
        }
        //step4 - sorted array -> balanced BST
        return createBST(FinalArr, 0, FinalArr.size()-1);
    }

    static void preOrder(Node root){
        if(root == null){
            System.out.println("Tree is empty");
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        Node root2 = new Node(3);
        root2.left = new Node(9);
        root2.right = new Node(12);
        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}