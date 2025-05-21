package LinearSearch;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-2,34,54};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
