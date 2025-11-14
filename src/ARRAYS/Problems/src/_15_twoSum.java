/*
    Strivers A2Z Sheet (Arrays -> Medium)
    Leetcode - 1

    Example:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _15_twoSum {
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
        int[] indexes = twoSum(nums,k);
        System.out.println("Indexes value that equals to k are: ");
        for(int ele: indexes)
        {
            System.out.print(ele+ " ");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];
            if(hm.containsKey(diff))
                return new int[]{hm.get(diff), i};
            hm.put(nums[i], i);
        }
        return new int[2];
    }
}
