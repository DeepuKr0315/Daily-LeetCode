package _2LeetCode;

public class _7_BS_33problem {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,-3,-2,-1};
        System.out.println(search(nums,3));
    }
    public static int search(int[] nums ,int target){
        int pivot = findPivot(nums);
        if(pivot==-1){
            return BinSearch(nums,target,0,nums.length-1);
        }
        if(target>=nums[0]){

            return BinSearch(nums,target,0,pivot-1);
        }
        return BinSearch(nums,target,pivot+1,nums.length-1);
    }
    static int BinSearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
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
