package LinkedList;

class Snode {
    int data;
    Snode next;

    Snode(int data) {
        this.data = data;
        next = null;
    }
}

public class sortedInsertLL {

    static Snode sorted(Snode head, int data) {
        Snode newNode = new Snode(data);

        // Case 1: Insert at the beginning or empty list
        if (head == null || data < head.data) {
            newNode.next = head;
            return newNode;
        }

        Snode curr = head;

        // Traverse until we find the correct spot
        while (curr.next != null && curr.next.data < data) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printLL(Snode head) {
        Snode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Snode head = null;
        head = sorted(head, 10);
        head = sorted(head, 5);
        head = sorted(head, 20);
        head = sorted(head, 15);

        printLL(head); // Output: 5 10 15 20
    }
}
