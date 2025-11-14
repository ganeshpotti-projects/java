/*
    Strivers A2Z Sheet (Arrays -> Easy)

    Example:
    Input: nums = [3,4,5,1,2]
    Output: [4,2]
 */

import java.util.Scanner;
public class _02_secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements into Array: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] secondElements = getSecondLargestAndSmallestElement(arr);
        System.out.println("Second Largest Element is: "+secondElements[0]);
        System.out.println("Second Smallest Element is: "+secondElements[1]);
    }

    public static int[] getSecondLargestAndSmallestElement(int[] arr)
    {
        int [] elements = getLargestAndSmallestElement(arr);
        int[] secondElements = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int ele : arr) {
            if (ele > secondElements[0] && ele != elements[0])
                secondElements[0] = ele;
            if (ele < secondElements[1] && ele != elements[1])
                secondElements[1] = ele;
        }
        return secondElements;
    }

    public static int[] getLargestAndSmallestElement(int[] arr)
    {
        int[] res = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int ele : arr) {
            res[0] = Math.max(res[0], ele);
            res[1] = Math.min(res[1], ele);
        }
        return res;
    }
}
