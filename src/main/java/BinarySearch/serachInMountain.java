package BinarySearch;

interface MountainArray{
    int length();
    int get(int ele);
}

class Something {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = mountainElement(mountainArr);

        // Binary search on ascending part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if(index != -1) return index;

        // Binary search on descending part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    static int mountainElement(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean ascending){
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if(midVal == target) return mid;

            if(ascending){
                if(midVal < target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(midVal > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

