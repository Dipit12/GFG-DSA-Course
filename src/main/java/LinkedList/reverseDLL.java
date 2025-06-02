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

public class reverseDLL {
    static Node reverse(Node head){
       if(head == null || head.next == null){
           return head;
       }
       Node prev = null;
       Node curr = head;
       while(curr != null){
           prev = curr.prev;
           curr.prev = curr.next;
           curr.next = prev;

           curr = curr.prev;
       }
       return prev.prev;
    }
}
