package Dequeue;


import java.util.ArrayDeque;

public class ds_with_max_and_min {
    ArrayDeque<Integer> d = new ArrayDeque<Integer>();

    void insertMin(int x){
        if(d.isEmpty()){
            d.addFirst(x);
            return;
        }
        if(d.peekFirst() > x){
            d.addFirst(x);
            return;
        }
        System.out.println("Smaller number already exists");
    }

    void insertMax(int x){
        if(d.isEmpty()){
            d.addFirst(x);
            return;
        }
        if(d.peekLast() < x){
            d.addLast(x);
            return;
        }
        System.out.println("Larger number already exists");
    }
    int getMin(){
        return d.getFirst();
    }
    int getMax(){
        return d.getLast();
    }
}
