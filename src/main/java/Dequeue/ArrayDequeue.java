package Dequeue;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.addLast(40);
        System.out.println(d.peekFirst());
    // using arrayDeque ad stack
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
