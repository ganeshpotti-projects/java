/*
    Strivers A2Z Sheet (Arrays -> Easy)
    Leetcode - 136

    Example:
    Input: nums = [4,1,2,1,2]
    Output: 4
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _12_singleNumber {
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
        int singleNumber = singleNumber(nums);
        System.out.println("Single number is: "+singleNumber);
    }

    public static int singleNumber(int [] nums)
    {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        for(int ele : set)
            res = ele;
        return res;
    }
}
