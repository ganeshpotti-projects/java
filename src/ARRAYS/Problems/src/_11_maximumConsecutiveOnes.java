/*
    Strivers Sheet (Arrays -> Easy)
    Leetcode - 485

    Example:
    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/

import java.util.Scanner;

public class _11_maximumConsecutiveOnes {
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
        int max = findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutive Ones are: "+max);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int cnt = 0, maxCnt = 0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==1)
                maxCnt = Math.max(++cnt, maxCnt);
            else
                cnt=0;
        }
        return maxCnt;
    }
}
