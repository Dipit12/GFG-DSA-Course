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

public class deleteLastNodeSLL {
    static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }
    static Node deleteNode(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
       return head;
    }
    public static void main(String[] args) {
        // create a basic linked list
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // link up the nodes
        n1.next = n2;
        n2.next = n3;

        display(n1);
        System.out.println("After deleting the tail node");
        Node head = deleteNode(n1);
       display(head);
    }

}
