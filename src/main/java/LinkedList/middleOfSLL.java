package LinkedList;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        next = null;
    }
}

public class middleOfSLL {

    static int lengthOfLL(Nodes head) {
        int count = 0;
        Nodes curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void middleLength(Nodes head) {
        int length = lengthOfLL(head);
        Nodes curr = head;

        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }

        System.out.println("Middle element: " + curr.data);
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println("Length: " + lengthOfLL(n1));
        middleLength(n1); // Output should be 3 (second middle of 4 elements)
    }
}
