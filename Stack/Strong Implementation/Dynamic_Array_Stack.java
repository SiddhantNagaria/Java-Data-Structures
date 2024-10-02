public class Dynamic_Array_Stack{
    //length of array
    protected int capacity;

    //default array capacity
    public static final int CAPACITY = 16; //power of 2
    public static int MINCAPACITY = 1<<15; //power of 2

    //array to implement stack
    protected int[] stackRep;

    //index of top of the stack 
    int top = -1;

    //initializes stack to use array of default length
    public Dynamic_Array_Stack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    //number of elements 
    public int size(){
        return top+1;
    }

    //stack empty or not
    public boolean isEmpty(){
        return (top<0);
    }

    //push
    public void push(int data) throws Exception{
        if(size()==capacity){
            expand();
        }
        stackRep[++top] = data;
    }
    private void expand(){
        int length = size();
        int[] newStack = new int[length<<1];
        System.arraycopy(stackRep, 0, newStack, 0, length);
        stackRep = newStack;
        this.capacity = length<<1;
    }

    //dynamic arary operation => shrinks to 1/2 if more than 3/4 empty
    private void shrink(){
        int length = top +1;
        if(length >= MINCAPACITY || top<<2>=length) return;
        length = length + (top<<1);
        if(top<MINCAPACITY)length = MINCAPACITY;
        int[] newStack = new int[length];
        System.arraycopy(stackRep, 0, newStack, 0, top+1);
        stackRep = newStack;
        this.capacity = length;
    }
    
    //inspect element
    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stackRep[top];
    }

    //remove element
    public int pop() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        shrink();
        return data;
    }
    
    //return string representation
    public String toString(){
        String s;
        s= "[";
        if(size()>0){
            s+=stackRep[0];
        }
        if(size()>1){
            for(int i =1; i<=size()-1;i++){
                s+=","+stackRep[i];
            }
        }
        return s+="]";
    }

}