package LinkedList;

class MyNode{
    int data;
    MyNode next;

    MyNode(int data){
        this.data = data;
        next = null;
    }

}


public class reverseLinkedListInGroups {
    static MyNode reverseK(MyNode head, int k){
        MyNode curr = head, next = null, prev = null;
        int count = 0;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            MyNode rest_head = reverseK(next,k);
            head.next = rest_head;

        }
        return prev;
    }
}
