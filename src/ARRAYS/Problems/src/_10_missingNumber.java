/*
     Strivers Sheet (Arrays -> Easy)
     Leetcode - 268

     Example:
     Input: nums = [3,0,1]
     Output: 2
     Explanation:
     n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number
     in the range since it does not appear in nums.
 */

import java.util.Scanner;

public class _10_missingNumber {
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
        int missingElement = missingNumber(nums);
        System.out.println("Missing Element is: "+missingElement);
    }

    public static int missingNumber(int[] nums)
    {
        int n = nums.length;
        int sumOfNumbers = (n*(n+1))/2, sumOfArray = 0;
        for(int ele : nums)
            sumOfArray += ele;
        return sumOfNumbers - sumOfArray;
    }
}
