package ArrayAndArrayList;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,32,24};
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println(isPresent(arr,k));
    }
    static boolean isPresent(int[] arr, int k){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
}
