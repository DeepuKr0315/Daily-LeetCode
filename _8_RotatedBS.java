package _2LeetCode;

public class _8_RotatedBS {
    public static void main(String[] args) {
        int[] nums = {5,7,9,10,2,3,4};
        int pivot = findPivot(nums);
        System.out.println(pivot+1);
    }

    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]>arr[0]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
