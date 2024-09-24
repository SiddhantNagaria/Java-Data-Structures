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
    
    //stack to use array of specified length
    public Fixed_Size_ArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }
    
    //return number of elements in the stack. O(1) time.
    public int size(){
        return top + 1;
    }

    //test whether stack is empty. O(1) time
    public boolean isEmpty(){
        return (top<0);
    }
    
    //insert an element at the top of the stack. O(1) time
    public void push(int data) throws Exception{
        if(size()==capacity){
            throw new Exception("Stack is full");
        }
        stackRep[++top] = data;
    }

    //inspects element at the top of the stack. O(1) time
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stackRep[top];
    }

    //removes the top element of the stack. O(1) time
    public int pop() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }
    
    //return string representation of the stack as list of elements
    public String toString(){
        String s = "[";
        for(int i = 0; i < size(); i++){
            s += stackRep[i];
        }
        s += "]";
        return s;
    }
}