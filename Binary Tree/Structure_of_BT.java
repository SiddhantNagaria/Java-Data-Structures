
public class Structure_of_BT {

    public int data;
    public Structure_of_BT left, right;

    public Structure_of_BT(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public Structure_of_BT getLeft() {
        return left;
    }

    public Structure_of_BT getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Structure_of_BT left) {
        this.left = left;
    }

    public void setRight(Structure_of_BT right) {
        this.right = right;
    }

}
