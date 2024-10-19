
import java.util.Stack;

public class Queue_with_two_stacks <T>{
    private Stack <T> stack1= new Stack<T>();
    private Stack <T> stack2= new Stack<T>();
    public void enqueue(T item){
        stack1.push(item);
    }
    public T dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}