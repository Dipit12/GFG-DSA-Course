package ArrayAndArrayList;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,45,21,29};
        // brute force approach - sort the arr and print arr[arr.length-2];
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    // swap the elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
