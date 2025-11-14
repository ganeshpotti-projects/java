/*
    Strivers A2Z Sheet (Arrays -> Medium)
    Leetcode - 121

    Example:
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

import java.util.Scanner;

public class _20_stockBuyAndSell1 {
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
        int maxProfit = maxProfit(nums);
        System.out.println("Maximum Profit is: "+maxProfit);
    }

    public static int maxProfit(int[] nums)
    {
        int minEle = nums[0], maxProfit = 0;
        for(int ele : nums)
        {
            int profit = ele - minEle;
            maxProfit = Math.max(profit, maxProfit);
            minEle = Math.min(ele,minEle);
        }
        return maxProfit;
    }
}
