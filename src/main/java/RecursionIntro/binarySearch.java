package RecursionIntro;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 1;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr, start, end, target));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, end, target);
        } else {
            return mid;
        }
    }
}
