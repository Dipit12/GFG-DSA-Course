package LinkedList;

//class myNode{
//    int data;
//    myNode next;
//
//    myNode(int data){
//        this.data = data;
//        next = null;
//    }
//}

public class loopDetectionUsingFloydCycle {
    static boolean isDetected(myNode head){
        myNode slow = head;
        myNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
