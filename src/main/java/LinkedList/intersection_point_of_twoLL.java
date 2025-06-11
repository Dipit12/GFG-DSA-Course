package LinkedList;

import java.util.ArrayList;

class myNode {
    int data;
    myNode next;

    myNode(int data) {
        this.data = data;
        next = null;
    }
}

public class intersection_point_of_twoLL {

    static int getIntersection(myNode head1, myNode head2) {
        ArrayList<myNode> arr = new ArrayList<>();  // Store nodes instead of integers

        myNode temp = head1;
        while (temp != null) {
            arr.add(temp);  // store reference to the node
            temp = temp.next;
        }

        myNode curr = head2;
        while (curr != null) {
            if (arr.contains(curr)) {  // compare reference, not data
                return curr.data;
            }
            curr = curr.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        // Common node
        myNode common = new myNode(3);
        common.next = new myNode(4);

        // List 1: 1 -> 2 -> 3 -> 4
        myNode head1 = new myNode(1);
        myNode n1 = new myNode(2);
        head1.next = n1;
        n1.next = common;

        // List 2: 10 -> 3 -> 4 (shares 3 -> 4 with List 1)
        myNode head2 = new myNode(10);
        head2.next = common;

        System.out.println(getIntersection(head1, head2));  // Output: 3
    }
}
