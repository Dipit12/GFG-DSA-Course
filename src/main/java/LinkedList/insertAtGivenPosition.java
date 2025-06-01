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

public class insertAtGivenPosition {
    static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data +  " ");
        display(head.next);
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

    static Node insertAtPos(int data, int pos, Node head){
        Node temp = new Node(data);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i <= pos-2 && curr != null; i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
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
        insertAtPos(4,2,n1);
        display(n1);

    }
}
