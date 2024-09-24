public class Fixed_Size_ArrayStack{
    //length of array to implement stack
    protected  int capacity;

    //default array capacity
    public static final int DEFAULT_CAPACITY = 10;

    //array to implement stack
    protected int[] stackRep;

    //index of top element
    protected int top = -1;

    //stack to use array of default length 
    public Fixed_Size_ArrayStack(){
        this(DEFAULT_CAPACITY);
    }
}