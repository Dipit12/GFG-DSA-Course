package LinkedList;

class Cnode {
    int data;
    Cnode next;
    Cnode prev;

    Cnode(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class circularLinkedListImplementation {

    static void printLL(Cnode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        for (Cnode r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
        System.out.println();
    }

    static Cnode insertAtHead(Cnode head, int data) {
        Cnode temp = new Cnode(data);
        if (head == null) {
            temp.next = temp; // Make it circular
            return temp;
        }

        Cnode curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.next = head;
        return temp; // temp is the new head
    }

    static Cnode insertAtEnd(Cnode head, int data){
        Cnode newNode = new Cnode(data);
        if(head == null){
            newNode.next =newNode;
            return newNode;
        }
        Cnode curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return head;
    }

    static Cnode deleteAtStart(Cnode head){
        if(head == null || head.next == null){
            return null;
        }

        Cnode curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    static Cnode deleteKth(Cnode head, int index){
        if(head == null || head.next == null){
            return null;
        }
        if(index == 1){
            return deleteAtStart(head);
        }
        Cnode curr = head;
        for(int i = 0; i < index - 2; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Cnode head = new Cnode(10);
        head.next = new Cnode(11);
        head.next.next = new Cnode(20);
        head.next.next.next = head; // make circular

        printLL(head); // Output: 10 11 20

        head = insertAtHead(head, 23); // update head
        printLL(head); // Output: 23 10 11 20
        head = insertAtEnd(head,245);
        printLL(head);
        head = deleteAtStart(head);
        printLL(head);
        head = deleteKth(head,3);
        printLL(head);
    }
}
