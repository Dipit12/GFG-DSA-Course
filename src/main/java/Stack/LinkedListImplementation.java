package Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        next =  null;
    }
}

class MyStack{
    Node head;
    int size;

    MyStack(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }
    boolean isEmpty(){
        return (head == null);
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){
        if(head == null){
            System.out.println("Stack underflow");
        }
        int res = head.data;
        head = head.next;
        return res;
    }
    int peek(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        return head.data;
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
