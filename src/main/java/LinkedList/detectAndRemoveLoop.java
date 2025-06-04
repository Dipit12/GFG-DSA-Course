package LinkedList;
//
//class myNode{
//    int data;
//    myNode next;
//
//    myNode(int data){
//        this.data = data;
//        next = null;
//    }
//}

public class detectAndRemoveLoop {

   void deleteLoop(myNode head){
       myNode fast = head;
       myNode slow = head;

       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next;
           if(slow == fast){
               break;
           }
       }
       if(slow != fast){
           return;
       }
       slow = head;
       while(fast.next != null){
           slow = slow.next;
           fast = fast.next;
       }
       fast.next = null;
   }
}
