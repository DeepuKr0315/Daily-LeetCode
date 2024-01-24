package _2LeetCode;
import java.util.*;
public class _4_BS_34problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        System.out.println(searchInd(arr,target));
    }
    public static int[] searchInd(int[] arr,int target){
        int left = searchLeft(arr,target);
        int right = searchRight(arr,target);
        return new int[]{left,right};
    }
    private static int searchLeft(int[] arr,int target){
        int index = -1,start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                index = mid;
                end = mid-1;
            }else if(target>=arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
    private static int searchRight(int[] arr, int target){
        int index = -1,start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                index = mid;
                start = mid+1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
}