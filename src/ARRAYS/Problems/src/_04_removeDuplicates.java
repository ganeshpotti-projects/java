/*
    Strivers A2Z Sheet (Arrays -> Easy)
    Leetcode - 26

    Example:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.Scanner;

public class _04_removeDuplicates {
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
        int uniqueNumbersCount = removeDuplicates(nums);
        System.out.println("There are "+uniqueNumbersCount+" unique Numbers in an Array.");
    }

    public static int removeDuplicates(int[] nums)
    {
        int i=0,j=0;
        while(j<nums.length)
        {
            if(nums[i]!=nums[j])
                nums[++i] = nums[j];
            j++;
        }
        return i+1;
    }
}
