package RecursionArrays;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;
        int index = 0;
        System.out.println(search(arr,target, index));
    }
    static ArrayList<Integer> list =  new ArrayList<>();
    static ArrayList<Integer> search(int[] arr, int target, int index){
        if(arr[index] == target){
            list.add(index);
        }
        if(index >= arr.length-1){
            return list;
        }
        return search(arr,target,index+1);
    }
}
