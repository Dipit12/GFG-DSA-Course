package LinkedList;

//class MyNode{
//    int data;
//    MyNode next;
//
//    MyNode(int data){
//        this.data = data;
//        next = null;
//    }
//
//}

public class removeDuplicateFromSortedList {

    static void removeDuplicate(MyNode head){
        if(head == null || head.next == null){
            return;
        }
        MyNode curr = head;
        while(curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
    }
}
