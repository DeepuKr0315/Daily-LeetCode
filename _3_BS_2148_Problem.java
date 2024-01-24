// Link to the problem ==> https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/
package _2LeetCode;
import java.util.*;
public class _3_BS_2148_Problem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements wants to enter in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countElements(arr));
    }
    public static int countElements(int[] nums) {
        int start = 0;
        int count = 0;
        int end = nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==nums.length-1){
                continue;
            }else if(nums[0]==nums[i] || nums[nums.length-1]==nums[i]){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
