package LinkedList;

import java.util.ArrayList;

class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data =data;
        next = null;
    }
}

public class reverseLL {
    static Node2 reverse(Node2 head){
        ArrayList<Integer> arr = new ArrayList<>();
        Node2 curr = head;
        for(Node2 r = head; r != null; r = r.next){
            arr.add(r.data);
        }
        for(int i = 0; i < arr.size(); i++){
            curr.data = arr.get(arr.size() - 1 - i);
            curr = curr.next;
        }
        return head;
    }

    static Node2 reverseRecursively(Node2 head){
        if(head == null || head.next == null){
            return head;
        }
        Node2 rest_head = reverseRecursively(head.next);
        Node2 rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    static void display(Node2 head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node2 n1 = new Node2(1);
        Node2 n2 = new Node2(2);
        Node2 n3 = new Node2(3);
        Node2 n4 = new Node2(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        display(n1);

       Node2 head = reverse(n1);
       display(head);

       Node2 head1 = reverseRecursively(n1);
       display(head1);
    }
}
