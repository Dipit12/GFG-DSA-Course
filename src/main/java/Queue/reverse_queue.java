package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        System.out.println(q1);

        while(q1.isEmpty() == false){
            s.push(q1.peek());
            q1.poll();
        }
        while(!s.isEmpty()){
            q1.offer(s.peek());
            s.pop();
        }
        System.out.println(q1);
    }
}
