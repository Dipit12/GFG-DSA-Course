package LinkedList;

//class Node{
//    int data;
//    Node next;
//    Node prev;
//
//    Node(int data){
//        this.data = data;
//        next = prev = null;
//    }
//}



public class insertAtEndDLL {
    
    static Node insert(Node head, int value){
        // first create the new node
        Node newNode = new Node(value);
        if(head == null){
            return newNode;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;
    }
    static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        // creating the nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // linking the nodes

        n1.next = n2;

        n2.next = n3;
        n2.prev = n1;

        n3.prev = n2;

        display(n1);
        System.out.println();
        Node newNode = insert(n1,67);
        Node newNode1 = insert(n1,68);
        Node newNode2 = insert(n1,69);
        display(newNode2);
    }

}
