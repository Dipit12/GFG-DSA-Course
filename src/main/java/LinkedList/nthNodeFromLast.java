package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        next = null;
    }
}

public class nthNodeFromLast {

    static int length(Node1 head) {
        int count = 0;
        Node1 curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void nthLastNode(Node1 head, int n) {
        int len = length(head);
        if (n > len || n <= 0) {
            System.out.println("Invalid n value: " + n);
            return;
        }

        int startIndex = len - n;
        Node1 curr = head;
        for (int i = 0; i < startIndex; i++) {
            curr = curr.next;
        }
        System.out.println("Nth node from last is: " + curr.data);
    }

    static void nthFromLastPointerApproach(Node1 head, int n){
        if(head == null){
            return;
        }
        Node1 fast = head;
        for(int i = 0; i < n;i++){
            if(fast == null){
                return;
            }
            fast = fast.next;
        }
        Node1 slow = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        // Create and link nodes
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Call the function
        nthLastNode(n1, 2);  // Should print 3
        nthFromLastPointerApproach(n1,2);
    }
}
