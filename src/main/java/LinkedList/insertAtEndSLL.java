package LinkedList;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        next = null;
//    }
//}

public class insertAtEndSLL {
    static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    static void insertAtEnd(int value, Node head){
        Node something = new Node(value);
        // reach till end of head
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = something;

    }

    public static void main(String[] args) {
        // lets say we want to add 5 to an existing linkedlist of 10->20->30
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        // linking the nodes
        head.next = n1;
        n1.next = n2;

        System.out.println("Original linked list is");
        display(head);
        // create a new node and insert it to the end of the linkedlist
//        Node n3  = new Node(5);
//        n2.next = n3;
//        System.out.println("Altered linked list is");
//        display(head);
        insertAtEnd(5,head);
        System.out.println("Altered linked list is");
        display(head);
    }
}
