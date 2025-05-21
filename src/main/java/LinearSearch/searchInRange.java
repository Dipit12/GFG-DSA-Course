package LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] nums = {30,34,21,94};
        System.out.println(linearSearch(nums,94,0,2));
    }

    static int linearSearch(int[] arr, int key, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
