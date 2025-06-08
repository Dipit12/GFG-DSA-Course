package Queue;

class CircularQueue {
    int[] arr;
    int cap;
    int front;
    int rear;
    int size;

    CircularQueue(int cap) {
        this.cap = cap;
        arr = new int[cap];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % cap;
        arr[rear] = x;
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        front = (front + 1) % cap;
        size--;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == cap;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    int getSize() {
        return size;
    }
}


public class circular_queue_implementation {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // Queue Overflow

        System.out.println(q.peek()); // 10
        q.dequeue();                  // remove 10
        q.enqueue(40);               // works now

        System.out.println(q.peek()); // 20
        q.dequeue();                  // remove 20
        System.out.println(q.peek()); // 30
        System.out.println("Size: " + q.getSize()); // 2
    }
}
