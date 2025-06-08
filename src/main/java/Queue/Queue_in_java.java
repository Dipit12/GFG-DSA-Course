package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_in_java {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        q.offer(40);
        q.offer(50);
        q.offer(60);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
