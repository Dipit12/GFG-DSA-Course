package LinearSearch;

public class implementation {
    public static void main(String[] args) {
        int[] nums = {30,34,21,94};
        System.out.println(linearSearch(nums,9));
    }

    static int linearSearch(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
