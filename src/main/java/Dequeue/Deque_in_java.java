package Dequeue;

import java.util.LinkedList;
import java.util.Deque;

public class Deque_in_java {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();
        d.offerFirst(1);
        d.offerFirst(2);
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.offerLast(10);
        d.offerLast(20);
        System.out.println(d);
        d.pollFirst();
        System.out.println(d);

        for(int i = d.size() - 1; i >= 0; i--){
            System.out.print(d.getLast() + " ");
            d.pollLast();
        }
    }
}
