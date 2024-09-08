class Stack {
    int stack[];
    int top = -1, max = 0;
    public Stack(int size) {
        size = max;
        stack = new int[size];
    }

    //push
    public void push(int data) {
        if (top < max - 1) {
            stack[top] = data;
            top++;
        } else {
            System.out.println("Stack is full"); //overflow
        }
    }

    //pop
    public void pop() {
        if (top >= 0) {
            System.out.println("popped out element is " + top);
            top--;
        } else {
            System.out.println("Stack is empty"); //underflow
        }
    }

    void display() {
        if (top >= 0) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}

public class Stack_Using_Array{
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}