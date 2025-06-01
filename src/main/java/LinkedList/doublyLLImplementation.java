package LinkedList;

class NodeD{
    int data;
    NodeD next;
    NodeD prev;

    NodeD(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class doublyLLImplementation {
    public static void main(String[] args) {

        // creating the nodes
        NodeD n1 = new NodeD(1);
        NodeD n2 = new NodeD(2);
        NodeD n3 = new NodeD(3);
        // linking the nodes

        n1.next = n2;

        n2.next = n3;
        n2.prev = n1;

        n3.prev = n2;
    }
}
