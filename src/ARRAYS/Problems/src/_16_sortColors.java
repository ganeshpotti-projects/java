/*
    Striver A2Z Sheet (Arrays -> Medium)
    Leetcode - 75

    Example:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
 */

import java.util.Scanner;

public class _16_sortColors {
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
        sortColors(nums);
        System.out.println("Array after sorting: ");
        for(int ele : nums)
        {
            System.out.print(ele+ " ");
        }
    }

    public static void sortColors(int[] nums)
    {
        int i=0, j=0, k=nums.length-1;
        while(j<=k)
        {
            if(nums[j]==0)
            {
                swap(nums, i, j);
                i++; j++;
            }else if(nums[j]==2)
            {
                swap(nums, j, k);
                k--;
            }else{
                j++;
            }
        }
    }

    public static void swap(int[] nums, int ind1, int ind2)
    {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
}
