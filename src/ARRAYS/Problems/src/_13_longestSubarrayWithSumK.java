/*
    Strivers A2Z Sheet (Arrays -> Easy)

    Example:
    Input: nums = [10, 5, 2, 7, 1, 9],  k=15
    Output: 4
    Explanation:
    The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4.
    This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1)
    equals 15. Therefore, the length of this sub-array is 4.
 */

import java.util.Scanner;

public class _13_longestSubarrayWithSumK {
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
        System.out.println("Enter the sum value: ");
        int k = sc.nextInt();
        int longestSubarray = longestSubarray(nums,k);
        System.out.println("Length of longest subarray is: "+longestSubarray);
    }

    public static int longestSubarray(int[] nums, int k)
    {
        int sum = 0, maxLen = 0;
        for(int i=0, j=0;j<nums.length;)
        {
            sum += nums[i];
            if(sum==k)
                maxLen = Math.max(maxLen, j-i+1);
            while(sum>k && i<=j)
            {
                sum -= nums[i++];
            }
            j++;
        }
        return maxLen;
    }
}
