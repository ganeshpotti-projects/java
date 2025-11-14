/*
    Strivers A2Z Sheet (Arrays -> Easy)
    Leetcode - 283

    Example:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
 */

import java.util.Scanner;

public class _07_moveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements into Array: ");
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println("Array After moving Zeroes to end: ");
        for(int ele : nums)
        {
            System.out.print(ele+" ");
        }
    }

    public static void moveZeroes(int [] nums){
        for(int i=0,j=1;j<nums.length;)
        {
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
    }
}
