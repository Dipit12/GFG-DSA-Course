package Stack;

import java.util.ArrayList;

class myStack{
    int cap;
    int top;
    int[] arr;
    myStack(int cap){
        top = -1;
        this.cap = cap;
        arr = new int[cap];
    }
    void push(int x){
        if(top == cap-1){
            System.out.println("Stack overflow");
        }
        top++;
        arr[top] = x;
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        top--;
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
}

class DynamicStack{
    ArrayList<Integer> arr = new ArrayList<>();

    void push(int x){
        arr.add(x);
    }
    void pop(){
        arr.remove(arr.size() - 1);
    }
    int size(){
        return arr.size();
    }
    boolean isEmpty(){
        return arr.isEmpty();
    }
    int peek(){
        return arr.get(arr.size() - 1);
    }
}

public class implementation {
    public static void main(String[] args) {
        myStack s = new myStack(5);
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
