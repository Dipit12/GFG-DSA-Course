package LinkedList;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        next = null;
//    }
//}
public class searchInSLL {

    static int search(Node head, int key){
        if(head == null){
            return -1;
        }
        Node curr = head;
        int count = 1;
        while(curr != null){

            if(curr.data == key){
                return count;
            }
            else{
                count++;
                curr = curr.next;
            }

        }
        return -1;
    }

    static int searchRecursive(Node head, int key){

        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 1;
        }else{
            int res = search(head.next,key);
            if(res == -1){
                return -1;
            }else{
                return (res+1);
            }
        }

    }
    public static void main(String[] args) {
        // create a basic linked list
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        // link up the nodes
        n1.next = n2;
        n2.next = n3;
        System.out.println(search(n1,3));
        System.out.println(searchRecursive(n1,2));
    }

}
