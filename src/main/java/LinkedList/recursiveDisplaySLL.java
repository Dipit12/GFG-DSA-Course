package LinkedList;
//
//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        next = null;
//    }
//}

public class recursiveDisplaySLL {

    static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        // linking the linked list
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        // printing the linkedlist
        display(head);
    }
}
