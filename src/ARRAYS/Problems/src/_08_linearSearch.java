/*
    Strivers A2Z Sheet (Arrays -> Easy)

    Example:
    Input: arr[]= 1 2 3 4 5, num = 3
    Output: 2
    Explanation: 3 is present in the 2nd index
 */

import java.util.Scanner;

public class _08_linearSearch {
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
        System.out.println("Enter element to be searched: ");
        int ele = sc.nextInt();
        int index = search(nums, ele);
        System.out.println("Element is found at index: "+index);
    }

    public static int search(int[] nums, int ele)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
                return i;
        }
        return -1;
    }
}
