package LinkedList;

public class pairwise_swap_nodes {
    Node pairWiseSwap(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr =curr.next.next;
        }
        return head;
    }
}
