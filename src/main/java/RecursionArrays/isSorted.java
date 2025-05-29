package RecursionArrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
       int index = 0;
        System.out.println(isSorted(arr,index));
    }

    static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        return (arr[index] < arr[index+1]) && isSorted(arr,index+1);
    }
}
