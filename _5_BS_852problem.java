package _2LeetCode;

public class _5_BS_852problem {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid;
            }else if(arr[mid]<arr[mid-1]){
                end = mid;
            }
        }
        return -1;
    }
}