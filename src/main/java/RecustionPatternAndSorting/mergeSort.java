package RecustionPatternAndSorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,42,134,11,21};
        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);
        System.out.println("After sorting");

        for(int n: arr){
            System.out.print(n + " ");
        }
    }

    static void mergeSort(int[] arr, int start, int end){
            if(start < end){
                int mid = (start + end)/2;
                mergeSort(arr,0,mid);
                mergeSort(arr,mid+1,end);
                merge(arr,start,mid,end);
            }
    }

    static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0; x< n1; x++){
            lArr[x] = arr[start + x];
        }
        for(int j = 0; j< n2; j++){
            lArr[j] = arr[start + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

    }
}
