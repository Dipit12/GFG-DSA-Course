package LinkedList;

class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int data){
        this.data = data;
        next = prev = null;
    }
}

public class insertAtBeginningDLL {
    static NodeDLL insert(NodeDLL head, int value){
        NodeDLL temp = new NodeDLL(value);
        if(head != null){
            head.prev = temp;
        }

        temp.next = head;
        head = temp;
        return head;
    }

    static void display(NodeDLL head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        // creating the nodes
        NodeDLL n1 = new NodeDLL(1);
        NodeDLL n2 = new NodeDLL(2);
        NodeDLL n3 = new NodeDLL(3);
        // linking the nodes

        n1.next = n2;

        n2.next = n3;
        n2.prev = n1;

        n3.prev = n2;

        display(n1);
        NodeDLL newNode = insert(n1,67);
        display(newNode);
    }
}
