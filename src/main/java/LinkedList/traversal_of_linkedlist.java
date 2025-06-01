package LinkedList;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        next = null;
//    }
//
//
//}

public class traversal_of_linkedlist {

    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int lengthOfLL(Node head){
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
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
        printLL(head);
        System.out.println();
        // length of the linked list
        System.out.printf("Length of linked list is %d" , lengthOfLL(head));
    }
}
