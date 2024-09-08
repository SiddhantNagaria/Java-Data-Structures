class Stack_Using_LinkedList{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    static class Stack{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        
        //push
        public Node push(Node top, int data){
            Node newNode = new Node(data);
            if(top == null){
                top = newNode;
            }
            else{
                newNode.next = top;
                top = newNode;
            }
            return top;
        }

        //pop
        Node pop(Node top){
            if(top!=null){ //if(isEmpty())
                top = top.next;
            }
            else{
                System.out.println("Stack is empty");
            }
            return top;
        }

        //peek
        void peek(Node top){
            if(top!=null){
                while(top!=null){
                    System.out.println(top.data);
                    top = top.next;
                }
            }else{
                System.out.println("Stack is empty");
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        Node top = null;
        top = stack.push(top, 10);
        top = stack.push(top, 20);
        top = stack.push(top, 30);
        stack.peek(top);
        top = stack.pop(top);
        stack.peek(top);
    }
}