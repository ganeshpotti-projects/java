/*
    Strivers A2Z Sheet (Arrays -> Easy)
    Leetcode - 1752

    Example:
    Input: nums = [3,4,5,1,2]
    Output: true
    Explanation: [1,2,3,4,5] is the original sorted array.
    You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
 */

import java.util.Scanner;

public class _03_checkIfArrayIsSortedAndRotated {
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
        boolean isSorted = check(nums);
        System.out.println("Is Sorted before or After Rotation of an Array: "+ isSorted);
    }

    public static boolean check(int[] nums)
    {
        int cnt = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                cnt++;
        }
        if(nums[nums.length-1]>nums[0])
            cnt++;
        return cnt<=1;
    }
}
