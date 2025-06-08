package Queue;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

class NodeQueue{
    Node front;
    Node rear;

    NodeQueue(){
        front = rear = null;
    }

    void enqueue(int x){
        Node temp = new Node(x);
        if(front == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    void dequeue(){
        if(front == null){
            return;
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
    }
}

public class implementation_using_LL {
}
