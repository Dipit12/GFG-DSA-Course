package ArrayAndArrayList;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.contains(8));
        list.set(0,2);
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
