/*
    Strivers A2Z Sheet (Arrays -> Easy)
    Leetcode - 189

    Example:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output:
    [5,6,7,1,2,3,4] (right)
    [4,5,6,7,1,2,3] (left)

    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    rotate 1 steps to the left: [2,3,4,5,6,7,1]
    rotate 2 steps to the left: [3,4,5,6,7,1,2]
    rotate 3 steps to the left: [4,5,6,7,1,2,3]
 */

import java.util.Scanner;

public class _05_rotateArray {
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
        System.out.println("Enter rotation Number: ");
        int k = sc.nextInt();
        System.out.println("Array before Rotation: ");
        for(int ele : nums)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        rotateRight(nums, k);
        System.out.println("Array After Right Rotation by "+ k+": ");
        for(int ele : nums)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        rotateLeft(nums, k);
        System.out.println("Array After Left Rotation by "+ k+": ");
        for(int ele : nums)
        {
            System.out.print(ele+" ");
        }
    }

    public static void rotateRight(int[] nums, int k)
    {
        int n = nums.length;
        k= k%n;
        reverse(nums, 0,n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public static void rotateLeft(int[] nums, int k)
    {
        int n = nums.length;
        k= k%n;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0,n-1);
    }

    public static void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}
