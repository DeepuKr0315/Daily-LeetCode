package _2LeetCode;

import java.util.Scanner;

public class CountEvenNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements wants to enter in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering the values ==> ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Number of even elements in the given array is: "+CountEvenNumbersInArray.evenelements(arr));
    }
    static int evenelements(int[] arr){
        int count = 0;
        for(int nums:arr){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int nd = digits(n);
        if(nd%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num!=0){
            count++;
            num = num/10;
        }
        return count;
    }
}
