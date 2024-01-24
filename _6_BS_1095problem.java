package _2LeetCode;

public class _6_BS_1095problem {
    public static void main(String[] args) {

    }
    int search(int[] arr,int target){
        int peak = PeakIndexMountainArray(arr);
        int start = 0;
        int firstTry = AgnosticBinarySearch(arr,target,start,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return AgnosticBinarySearch(arr,target,peak,arr.length-1);
    }
    public int PeakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public int AgnosticBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[0]>arr[1];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }if(isAsc){
                if (target>arr[mid]) {
                    start = mid+1;
                } else if (target<arr[mid]) {
                    end = mid-1;
                }
            }else{
                if (target>arr[mid]) {
                    end = mid-1;
                } else if (target<arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
