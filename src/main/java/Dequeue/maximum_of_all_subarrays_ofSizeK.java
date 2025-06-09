package Dequeue;

public class maximum_of_all_subarrays_ofSizeK {
    public static void main(String[] args) {
        // naive solution
        int[] arr = {10,8,5,12,15,7,6};
        int k = 3;
        for(int i = 0; i < arr.length -k + 1; i++){
            int max = arr[i];
            for(int j = i+1; j < i+k;j++){
                max = Math.max(max, arr[j]);
            }
            System.out.println(max);
        }
    }


}
