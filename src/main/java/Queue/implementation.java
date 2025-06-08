package Queue;

class Queue{
    int[] arr;
    int size;
    int cap;
    int front;
    Queue(int cap){
        this.cap = cap;
        size = 0;
        arr = new int[cap];
        front = 0;
    }

    boolean isFull(){
        return (size == cap);
    }

    boolean isEmpty(){
        return(size == 0);
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[size] = x;
        size++;
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[size-1];
    }
}


public class implementation {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue(); // 10
        q.enqueue(40);                   // OK, reused space
        q.dequeue(); // 20
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
