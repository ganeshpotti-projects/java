/*
    Striver A2Z Sheet (Arratys -> Medium)
    Leetcode - 53

    Example:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

import java.util.Scanner;

public class _18_maximumSubarray {
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
        int maximumSubarray = maxSubarray(nums);
        System.out.println("Maximum Subarray sum is: "+maximumSubarray);
    }

    public static int maxSubarray(int[] nums)
    {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
